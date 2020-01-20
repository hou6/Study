package com.houliu.设计模式.工厂模式.方法工厂;

/**
 * @author houliu
 * @create 2020-01-18 15:43
 */
public class HuaweiPhoneFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }
}
