package com.ouyang.abstractfactory;

public interface IPhoneFactory {
    public IScrean creatScrean();
    public ICPU createCPU();
}
