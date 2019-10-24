package com.ouyang.abstractfactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        IPhoneFactory hw = new HWMobileFactory();
        ICPU hwCPU = hw.createCPU();
        IScrean hwScrean = hw.creatScrean();
        hwCPU.msg();
        hwScrean.msg();
    }
}
