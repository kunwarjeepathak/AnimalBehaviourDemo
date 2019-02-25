package com.animal.behaviour.model;

import com.animal.behaviour.impl.WalkBehaviourImpl;

public class Animal extends Parent {

    public Animal(){
        this.walkBehaviour=new WalkBehaviourImpl();
    }
}
