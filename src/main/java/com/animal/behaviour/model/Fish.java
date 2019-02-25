package com.animal.behaviour.model;

import com.animal.behaviour.impl.SingBehaviourImpl;
import com.animal.behaviour.impl.SwimBehaviourImpl;
import com.animal.behaviour.impl.WalkBehaviourImpl;
import com.animal.behaviour.util.Color;
import com.animal.behaviour.util.Size;

public class Fish  extends Parent{

    protected Size size;
    protected Color color;

    public Fish(){
        this.swimBehaviour=new SwimBehaviourImpl();
        this.walkBehaviour =new WalkBehaviourImpl();
        this.singBehaviour= new SingBehaviourImpl();
    }

    public Size size() {
        return size;
    }

    public Color color() {
        return color;
    }
}
