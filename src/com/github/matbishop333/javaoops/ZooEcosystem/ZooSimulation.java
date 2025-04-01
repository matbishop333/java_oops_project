package com.github.matbishop333.javaoops.ZooEcosystem;

import java.util.List;

public class ZooSimulation {
    public static void main(String[] args) {
        Lion adam = new Lion("Adam", 8, 330,"High", true,false,0);
        Elephant eve = new Elephant("Eve", 40, 6000, "low",true,false,0);
        Parrot polly = new Parrot("Polly", 40,3,"low",true,false, 0);
        Eagle eric =  new Eagle("Eric", 20, 6, "low", true, false, 0);

        List<Animal> zoo = List.of(adam, eve, polly, eric);
        for (Animal a : zoo) {
            a.displayInfo();
            a.makeSound();
            a.sleep();
            System.out.println();
        }

    }
}
