package com.animal.behaviour.birds;

import com.animal.behaviour.impl.DuckSound;
import com.animal.behaviour.impl.SwimBehaviourImpl;
import com.animal.behaviour.model.Bird;

public class Duck extends Bird {

    public Duck(){
        this.singBehaviour =new DuckSound();
        this.swimBehaviour= new SwimBehaviourImpl();
    }
}
