package com.houliu.设计模式.工厂模式.方法工厂;

/**
 * @author houliu
 * @create 2020-01-18 15:44
 */
public class Test {
    public static void main(String[] args) {
        HuaweiPhone huaweiPhone = (HuaweiPhone) new HuaweiPhoneFactory().getPhone();
        huaweiPhone.callUp();
        huaweiPhone.sendSMS();

        System.out.println("=========================================");

        ChuiziPhone chuiziPhone = (ChuiziPhone) new ChuiziPhoneFactory().getPhone();
        chuiziPhone.callUp();
        chuiziPhone.sendSMS();

        System.out.println("=========================================");
        XiaomiPhone xiaomiPhone = (XiaomiPhone) new XiaomiPhoneFactory().getPhone();
        xiaomiPhone.callUp();
        xiaomiPhone.sendSMS();
    }
}
