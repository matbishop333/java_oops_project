package com.github.matbishop333.javaoops.ZooEcosystem;

public class Lion extends Mammal{
    public Lion(String name, int age, int weight, String threatLevel, boolean isFed, boolean isSleeping, int hungerLevel) {
        super(name,"Mammal: Lion", "Savannah",age,weight, threatLevel,isFed,isSleeping,hungerLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the lion roars");
    }

    @Override
    public void sleep() {
        System.out.println(name + " the lion is asleep");
    }
}
