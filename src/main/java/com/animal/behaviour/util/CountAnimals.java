package com.animal.behaviour.util;

import com.animal.behaviour.impl.FlyBehaviourImpl;
import com.animal.behaviour.impl.SingBehaviourImpl;
import com.animal.behaviour.impl.SwimBehaviourImpl;
import com.animal.behaviour.impl.WalkBehaviourImpl;
import com.animal.behaviour.model.Parent;

public class CountAnimals {



    public int  walkCount(Parent animals[]) {
        int count=0;
        if(animals.length==0){
            return count;
        }

        for(Parent vertibrate:animals){
            if(vertibrate.getWalkBehaviour()!=null &&  vertibrate.getWalkBehaviour() instanceof WalkBehaviourImpl){
                count++;
            }
        }
        return count;
    }

    public int flyCount(Parent[] animals) {
        int count=0;
        for(Parent animal:animals){
            if(animal.getFlyBehaviour()!=null
                    && animal.getFlyBehaviour() instanceof FlyBehaviourImpl){
                count++;
            }
        }
        return count;
    }

    public int singCount(Parent[] animals) {
        int count=0;
        for(Parent animal:animals){
            if(animal.getSingBehaviour()!=null
                    && animal.getSingBehaviour() instanceof SingBehaviourImpl){
                count++;
            }
        }
        return count;
    }

    public int swimCount(Parent[] animals) {
        int count=0;
        for(Parent animal:animals){
            if(animal.getSwimBehaviour()!=null
                    && animal.getSwimBehaviour() instanceof SwimBehaviourImpl){
                count++;
            }
        }
        return count;
    }
}
