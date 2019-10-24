package com.ouyang.simple;

public class CarFactory {
    public ICar createCar(String carName){
        if(carName.equals("volvo")){
            return new Volvo();
        }else if(carName .equals("toyota")){
            return new Toyota();
        }
        return null;
    }
}
