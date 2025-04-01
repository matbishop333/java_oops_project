package com.github.matbishop333.javaoops.ZooEcosystem;

public class Bird extends Animal{

    public Bird(String name,String animalType, int age, int weight, String threatLevel, boolean isFed, boolean isSleeping, int hungerLevel){
        super(name, animalType, "Aviary", age, weight, threatLevel, isFed, isSleeping, hungerLevel);
    }


    @Override
    public void makeSound() {
        System.out.println(name + " the " + animalType + " chirps happily.");
    }

    @Override
    public void eat() {
        if(isFed){
            System.out.println(name + " the " + animalType + " is not hungry. They have already been fed.");
        } else {
            System.out.println(name + " the " + animalType + " is eating");
            isFed = true;
            hungerLevel = 0;
        }
    }

    @Override
    public void sleep() {
        System.out.println(name + " the " + animalType + " is asleep");
    }
}
