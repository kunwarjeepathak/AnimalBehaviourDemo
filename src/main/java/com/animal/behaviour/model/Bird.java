package com.animal.behaviour.model;

import com.animal.behaviour.impl.FlyBehaviourImpl;
import com.animal.behaviour.impl.SingBehaviourImpl;
import com.animal.behaviour.impl.WalkBehaviourImpl;

public class Bird extends Parent{

    public Bird(){
        this.walkBehaviour=new WalkBehaviourImpl();
        this.flyBehaviour =new FlyBehaviourImpl();
        this.singBehaviour=new SingBehaviourImpl();
    }
}
