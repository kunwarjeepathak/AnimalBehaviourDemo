package com.animal.behaviour.impl;

import com.animal.behaviour.model.Animal;

public class Caterpillar extends Animal {

    public Caterpillar(){
        this.flyBehaviour= new FlyBehaviourImpl();
        this.walkBehaviour= new WalkBehaviourImpl();
    }
}
