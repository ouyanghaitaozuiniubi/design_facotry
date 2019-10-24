package com.ouyang.method;

public class TestMethodFactory {
    public static void main(String[] args) {
        IComputerFactory hp = new HPComputerFactory();
        IComputer hpcomputer = hp.productorComputer();
        hpcomputer.msg();
        IComputerFactory dell = new DellComputerFactory();
        IComputer dellc = dell.productorComputer();
        dellc.msg();

    }
}
