package com.animal.behaviour.birds;

import com.animal.behaviour.impl.ChickenSound;
import com.animal.behaviour.impl.FlyBehaviourImpl;
import com.animal.behaviour.model.Bird;

public class Chicken extends Bird {

    public  Chicken(){
        this.singBehaviour=new ChickenSound();
        this.flyBehaviour =new FlyBehaviourImpl();
    }
}
