package com.animal.behaviour.impl;

import com.animal.behaviour.model.Animal;

public class Cat extends Animal {

    public Cat(){
        this.singBehaviour= new CatSound();
    }
}
