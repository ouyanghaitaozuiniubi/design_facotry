package com.ouyang.method;

public class HPComputerFactory implements  IComputerFactory {
    @Override
    public IComputer productorComputer() {
        return new HPComputer();
    }
}
