package com.bootcampexcercise.module10;
//class should be abstract
// create attributes in Person class: name, age
// define introduce method

public abstract class Person {

    //creating attributes
    private String name;
    private int age;


    //getters and setters

    public int getAge() {
        return age;
    }
    public void setAge (int age) {

        this.age = age;
}

    public String getName() {

        return name;
}

    public void setName(String name) {
    this.name = name;

    }
    abstract void introducePerson();



}

