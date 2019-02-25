package com.animal.behaviour.impl;

import com.animal.behaviour.model.Animal;

public class Dog extends Animal {

    public Dog(){
        this.singBehaviour = new DogSound();
    }
}
