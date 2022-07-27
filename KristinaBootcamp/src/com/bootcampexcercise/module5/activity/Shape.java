package com.bootcampexcercise.module5.activity;

public abstract class  Shape {

    public String color;

    public Shape() {

    }

    //TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double
    public abstract double calculateArea(double sideone, double sidetwo, double radius);
    public abstract double calculatePerimeter(double sideone, double sidetwo, double radius);

    //get and set color
    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }

}
