package com.github.matbishop333.javaoops.ZooEcosystem;

public class Mammal extends Animal{

    public Mammal(String name, String animalType, String habitat, int age, int weight, String threatLevel, boolean isFed, boolean isSleeping, int hungerLevel){
        super(name, animalType, habitat, age, weight, threatLevel, isFed, isSleeping, hungerLevel);
    }


    @Override
    public void makeSound() {
        System.out.println(name + " the " + animalType + " makes a low growling sound");
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
