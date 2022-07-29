package com.bootcampexcercise.module10;

// create public static void main
//call bike and car methods

public class InterfaceActivityClass {
    public static void main (String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        bike.start();
        bike.stop();
        car.start();
        car.stop();
    }

}
