package com.animal.behaviour.birds;

import com.animal.behaviour.impl.RoosterSound;
import com.animal.behaviour.model.Bird;

public class Rooster extends Bird {

    Chicken chicken;

    public Rooster(){
        this.singBehaviour= new RoosterSound();
        this.chicken=new Chicken();
    }

    @Override
    public void fly(){
        this.chicken.fly();
    }
}
