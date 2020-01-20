package com.houliu.设计模式.工厂模式.抽象工厂;

/**
 * @author houliu
 * @create 2020-01-18 16:01
 */
public class Test {
    public static void main(String[] args) {
        HuaweiPhone huaweiPhone = (HuaweiPhone) new HuaweiFactory().getPhone();
        huaweiPhone.callUp();
        huaweiPhone.sendSMS();

        HuaweiComputer huaweiComputer = (HuaweiComputer) new HuaweiFactory().getComputer();
        huaweiComputer.installQQ();
        huaweiComputer.installWechat();

        ChuiziComputer chuiziComputer = (ChuiziComputer) new ChuiziFactory().getComputer();
        chuiziComputer.installQQ();
        chuiziComputer.installWechat();

        ChuiziPhone chuiziPhone = (ChuiziPhone) new ChuiziFactory().getPhone();
        chuiziPhone.callUp();
        chuiziPhone.sendSMS();
    }
}
