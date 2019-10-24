package com.ouyang.abstractfactory;

public class HWMobileFactory implements  IPhoneFactory {


    @Override
    public IScrean creatScrean() {
        return new JDISCrean();
    }

    @Override
    public ICPU createCPU() {
        return new HWCpu();
    }
}
