package com.github.matbishop333.javaoops.ZooEcosystem;

public class Elephant extends Mammal{
    public Elephant(String name, int age, int weight, String threatLevel, boolean isFed, boolean isSleeping, int hungerLevel){
        super(name, "Mammal: Elephant","Elephant Sanctuary",age,weight,threatLevel,isFed,isSleeping,hungerLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the elephant trumpets loudly!");

    }

    @Override
    public void sleep() {
        System.out.println(name + " the elephant is asleep");
    }
}
