package com.tech.Phone.model;

/**
 * 手机信息
 *
 * @author Lcy
 * @date 2018/11/14 10:11
 */
public class PhoneInfo {
    /**
     * 手机号
     */
    private String phone;
    /**
     * 所属省
     */
    private String province;
    /**
     * 所属市
     */
    private String city;
    /**
     * 区号
     */
    private String cityCode;
    /**
     * 邮编
     */
    private String postCode;
    /**
     * 运营商
     */
    private String operator;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
