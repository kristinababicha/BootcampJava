package com.bootcampexcercise.module5.activity;

public class AbstractActivity {
    public static void main(String args[]) {
        Rectangle rectangle= new Rectangle();
        rectangle.setColor("Pink");
            System.out.println(rectangle.getColor());

        // set and Print color of rectangle
        System.out.println("Rectanglearea" +rectangle.calculateArea(3, 4,5));

        // Give area of rectangle
        System.out.println("RectanglePerimeter" +rectangle.calculatePerimeter(3,4,5));

        // Print perimeter of rectangle
        Circle circle= new Circle ();
        circle.setColor("Red");
        System.out.println( circle.getColor());

        // set and Print color of circle
        System.out.println("Circlearea is " +circle.calculateArea(3,4,5));
        // Give area of circle
        System.out.println("Circleperimeter is " +circle.calculatePerimeter(3,4,5));
        // Print perimeter of circle
    }
}
