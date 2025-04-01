package com.github.matbishop333.javaoops.ZooEcosystem;


public abstract class Animal implements AnimalBehavior{
    String name;
    String animalType;
    String habitat;
    int age;
    int weight;
    String threatLevel;
    boolean isSleeping;
    boolean isFed;
    int hungerLevel;

    private String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public Animal(String name, String animalType, String habitat, int age, int weight, String threatLevel, boolean isSleeping, boolean isFed, int hungerLevel){
        this.name = name;
        this.animalType = animalType;
        this.habitat = habitat;
        this.age = age;
        this.weight = weight;
        this.threatLevel = threatLevel;
        this.isSleeping = isSleeping;
        this.isFed = isFed;
        this.hungerLevel = Math.max(0, Math.min(hungerLevel, 10));


        if (threatLevel.equalsIgnoreCase("low") ||
                threatLevel.equalsIgnoreCase("high") ||
                threatLevel.equalsIgnoreCase("extreme")) {
            this.threatLevel = capitalize(threatLevel);
        } else {
            this.threatLevel = "Low";
        }


    }

    @Override
    public void makeSound() {
        System.out.println("Animal makes sound");
    }

    @Override
    public void eat() {
        if(isFed){
            System.out.println("Animal is not hungry. They have already been fed.");
        } else {
            System.out.println("Animal is eating");
            isFed = true;
            hungerLevel = 0;
        }
    }

    @Override
    public void sleep() {
        System.out.println("Animal is asleep");
    }

    public void displayInfo(){
        System.out.println("Details on Animal:");
        System.out.println("Animal name: " + name);
        System.out.println("Animal type: " + animalType);
        System.out.println("Habitat: " + habitat);
        System.out.println("Age: " + age + " Weight: " + weight);
        System.out.println("Threat level: " + threatLevel);
        if(isSleeping){
            System.out.println("Current State: Sleeping");
        } else {
            System.out.println("Current State: Awake");
        }
        if(isFed){
            System.out.println("Animal has been fed. Hunger level is: " + hungerLevel);
        } else {
            System.out.println("Animal is hungry. Hunger level is : " + hungerLevel);
        }
    }
}
