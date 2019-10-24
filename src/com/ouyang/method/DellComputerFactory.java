package com.ouyang.method;

public class DellComputerFactory implements  IComputerFactory {
    @Override
    public IComputer productorComputer() {
        return new DellComputer();
    }
}
