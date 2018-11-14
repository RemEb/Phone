package com.tech.Phone.service;

import com.tech.Phone.model.PhoneInfo;

/**
 * 号码识别服务接口
 *
 * @author Lcy
 * @date 2018/11/14 10:11
 */
public interface PhoneRecognizeService {

    PhoneInfo onCall(String phone);



}

