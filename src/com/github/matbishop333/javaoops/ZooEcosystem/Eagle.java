package com.github.matbishop333.javaoops.ZooEcosystem;

public class Eagle extends Bird {
    public Eagle(String name, int age, int weight, String threatLevel, boolean isFed, boolean isSleeping, int hungerLevel){
        super(name, "Bird: Eagle", age, weight, threatLevel, isFed, isSleeping, hungerLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " the eagle squawks loudly!");

    }

    @Override
    public void sleep() {
        System.out.println(name + " the eagle is asleep");
    }
}
