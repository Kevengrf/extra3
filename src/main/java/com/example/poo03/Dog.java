package com.example.poo03;

import java.util.ArrayList;
class Dog extends Animal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight, new ArrayList<>());
        getAbilities().add("sniff");
    }

    @Override
    public String sound() {
        return "au";
    }
}