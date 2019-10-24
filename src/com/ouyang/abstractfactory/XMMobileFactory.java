package com.ouyang.abstractfactory;

public class XMMobileFactory implements  IPhoneFactory {
    @Override
    public IScrean creatScrean() {
        return new SumgScrean();
    }

    @Override
    public ICPU createCPU() {
        return new GTCpu();
    }
}
