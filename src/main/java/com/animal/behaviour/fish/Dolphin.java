package com.animal.behaviour.fish;

import com.animal.behaviour.impl.SwimBehaviourImpl;
import com.animal.behaviour.model.Fish;
import com.animal.behaviour.model.Parent;

public class Dolphin extends Parent {

    Fish fish;

    public Dolphin(){
        this.swimBehaviour= new SwimBehaviourImpl();
        this.fish =new Fish();
        this.walkBehaviour = this.fish.getWalkBehaviour();
        this.singBehaviour = this.fish.getSingBehaviour();
    }

}
