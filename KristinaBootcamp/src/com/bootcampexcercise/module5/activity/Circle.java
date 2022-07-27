package com.bootcampexcercise.module5.activity;

public class Circle extends Shape{
    // TODO: Implement calculateArea and calculatePerimeter in this class
  public double calculateArea ( double sideone, double sidetwo, double radius) {
      return  3.14 * radius* radius;
  }
  public double calculatePerimeter ( double sideone, double sidetwo, double radius) {
      return radius*2*3.14;
  }


}
