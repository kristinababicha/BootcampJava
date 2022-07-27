package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape {
        // TODO: Implement calculateArea and calculatePerimeter in this class
    public double calculateArea(double sideone, double sidetwo, double radius) {
        return sideone * sidetwo;
    }

    public double calculatePerimeter (double sideone,
                                      double sidetwo, double radius) {
        return 2 * ( sideone * sidetwo );
    }

}
