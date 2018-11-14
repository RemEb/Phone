package com.tech;

import com.tech.Phone.model.PhoneInfo;
import com.tech.Phone.service.impl.PhoneRecognizeServiceImpl;

/**
 * @author Lcy
 * @date 2018/11/14 10:37
 */
public class App {

    private static PhoneRecognizeServiceImpl phoneRecognizeService = new PhoneRecognizeServiceImpl();

    public static void main(String[] args) {
        PhoneInfo info = phoneRecognizeService.onCall("15651866611");
        System.out.println(info.getProvince()+":"+info.getCity());
    }
}
