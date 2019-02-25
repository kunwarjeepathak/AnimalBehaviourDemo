package com.animal.behaviour.impl;

import com.animal.behaviour.model.Animal;

public class Frog extends Animal {

    public Frog(){
        this.singBehaviour =new SingBehaviourImpl();
    }

}
