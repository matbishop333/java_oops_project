package com.github.matbishop333.javaoops.ZooEcosystem;

public class Parrot extends Bird{
    public Parrot(String name, int age, int weight, String threatLevel, boolean isFed, boolean isSleeping, int hungerLevel){
        super(name, "Bird: Parrot", age, weight, threatLevel, isFed, isSleeping, hungerLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the parrot mimics human speech: \"Hello! Pretty bird!\"");
    }

    @Override
    public void sleep() {
        System.out.println(name + " the parrot is asleep");
    }
}
