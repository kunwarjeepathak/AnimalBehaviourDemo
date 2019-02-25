package com.animal.behaviour.impl;


public class RoosterSound extends SingBehaviourImpl {

    @Override
    public void sing() {
        System.out.println(getSound("rooster"));
    }
}
