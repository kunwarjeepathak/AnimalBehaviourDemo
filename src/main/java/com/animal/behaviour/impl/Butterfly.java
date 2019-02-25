package com.animal.behaviour.impl;


public class Butterfly extends Caterpillar {

    public Butterfly(){
        this.flyBehaviour =new FlyBehaviourImpl();
        this.singBehaviour= new SingBehaviourImpl();
    }
}
