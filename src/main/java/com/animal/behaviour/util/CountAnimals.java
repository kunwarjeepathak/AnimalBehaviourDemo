package com.animal.behaviour.util;

import com.animal.behaviour.impl.FlyBehaviourImpl;
import com.animal.behaviour.impl.SingBehaviourImpl;
import com.animal.behaviour.impl.SwimBehaviourImpl;
import com.animal.behaviour.impl.WalkBehaviourImpl;
import com.animal.behaviour.model.Parent;

public class CountAnimals {



    public int  walkCount(Parent vertebrates[]) {
        int count=0;
        if(vertebrates.length==0){
            return count;
        }

        for(Parent vertibrate:vertebrates){
            if(vertibrate.getWalkBehaviour()!=null &&  vertibrate.getWalkBehaviour() instanceof WalkBehaviourImpl){
                count++;
            }
        }
        return count;
    }

    public int flyCount(Parent[] vertebrates) {
        int count=0;
        for(Parent vertebrate:vertebrates){
            if(vertebrate.getFlyBehaviour()!=null
                    && vertebrate.getFlyBehaviour() instanceof FlyBehaviourImpl){
                count++;
            }
        }
        return count;
    }

    public int singCount(Parent[] vertebrates) {
        int count=0;
        for(Parent vertebrate:vertebrates){
            if(vertebrate.getSingBehaviour()!=null
                    && vertebrate.getSingBehaviour() instanceof SingBehaviourImpl){
                count++;
            }
        }
        return count;
    }

    public int swimCount(Parent[] vertebrates) {
        int count=0;
        for(Parent vertebrate:vertebrates){
            if(vertebrate.getSwimBehaviour()!=null
                    && vertebrate.getSwimBehaviour() instanceof SwimBehaviourImpl){
                count++;
            }
        }
        return count;
    }
}
