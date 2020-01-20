package com.houliu.设计模式.工厂模式.抽象工厂;

/**
 * @author houliu
 * @create 2020-01-18 16:00
 */
public class HuaweiFactory implements ProductFactory {
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Computer getComputer() {
        return new HuaweiComputer();
    }
}
