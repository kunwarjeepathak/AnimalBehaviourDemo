package com.animal.behaviour.model;

import com.animal.behaviour.FlyBehaviour;
import com.animal.behaviour.SingBehaviour;
import com.animal.behaviour.SwimBehaviour;
import com.animal.behaviour.WalkBehaviour;

public abstract class Parent {

    protected WalkBehaviour walkBehaviour;
    protected FlyBehaviour flyBehaviour;
    protected SingBehaviour singBehaviour;
    protected SwimBehaviour swimBehaviour;

    public void walk(){
        this.walkBehaviour.walk();
    }

    public void fly() {
        this.flyBehaviour.fly();
    }

    public void sing() {
        this.singBehaviour.sing();
    }

    public void swim() {
        this.swimBehaviour.swim();
    }


    public WalkBehaviour getWalkBehaviour() {
        return walkBehaviour;
    }

    public void setWalkBehaviour(WalkBehaviour walkBehaviour) {
        this.walkBehaviour = walkBehaviour;
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public SingBehaviour getSingBehaviour() {
        return singBehaviour;
    }

    public void setSingBehaviour(SingBehaviour singBehaviour) {
        this.singBehaviour = singBehaviour;
    }

    public SwimBehaviour getSwimBehaviour() {
        return swimBehaviour;
    }

    public void setSwimBehaviour(SwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
}
