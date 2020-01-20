package com.houliu.设计模式.工厂模式.方法工厂;

/**
 * @author houliu
 * @create 2020-01-18 15:54
 */
public class XiaomiPhoneFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new XiaomiPhone();
    }
}
