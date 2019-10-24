package com.ouyang.simple;

public class TestSimple {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        ICar volvo = factory.createCar("volvo");
        ICar toyota = factory.createCar("toyota");
        volvo.msg();
        toyota.msg();

    }
}
