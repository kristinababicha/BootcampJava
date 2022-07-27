package com.bootcampexcercise.module6;

public class Mammal {
    private Animal myAnimal;
    private String name;

    //TODO create constructor for Mammal with parameter name
    public Mammal (String name) {
        this.name=name;
    }


    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    public void animalIsSleeping() {
        System.out.println("Animal: " + name+ " is ");
        myAnimal.sleep();
        //TODO: write code so that Animal sleep implementation is used

    }

    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name + " is");
        //TODO: write code so that Animal animalSound implementation is used
        myAnimal.animalSound();

    }
}
