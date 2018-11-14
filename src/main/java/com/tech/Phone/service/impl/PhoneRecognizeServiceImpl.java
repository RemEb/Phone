package com.tech.Phone.service.impl;

import com.tech.Phone.model.PhoneInfo;
import com.tech.Phone.service.PhoneRecognizeService;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Lcy
 * @date 2018/11/14 10:11
 */
public class PhoneRecognizeServiceImpl implements PhoneRecognizeService {

    private static Map<String, PhoneInfo> caches = new LinkedHashMap<>();

    static {
        InputStream in = PhoneRecognizeServiceImpl.class.getResourceAsStream("/phone.data.txt");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(in)
        );
        reader.lines().forEach(line -> {
            PhoneInfo phoneInfo = new PhoneInfo();
            String[] lines = line.split("\t");
            caches.put(lines[0], phoneInfo);
            phoneInfo.setCity(lines[2]);
            phoneInfo.setCityCode(lines[4]);
            phoneInfo.setOperator(lines[3]);
            phoneInfo.setProvince(lines[1]);
            phoneInfo.setPostCode(lines[5]);

        });
    }

    @Override
    public PhoneInfo onCall(String phone) {
        String phonePrefix = phone.substring(0, 7);
        PhoneInfo info = new PhoneInfo();

        List<String> list = caches.keySet()
                .stream()
                .collect(Collectors.toList());

        return binarySearch(list, 0, list.size() - 1, Integer.parseInt(phonePrefix));
    }

    private PhoneInfo binarySearch(List<String> list, int start, int end, int hkey) {
        PhoneInfo info = new PhoneInfo();

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = Integer.parseInt(list.get(mid));

            if (val > hkey) {
                end = mid - 1;
            } else if (val < hkey) {
                start = mid + 1;
            } else {
                info = caches.get(list.get(mid));
                break;
            }
        }

        return info;
    }
}
