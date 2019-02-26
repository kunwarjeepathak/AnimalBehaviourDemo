package com.animal.behaviour;

import org.junit.Test;

import com.animal.behaviour.model.Animal;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnimalTest  extends AbstractTest{

    @Test
    public void testWalk(){
        Animal animal= new Animal();
        animal.walk();
        assertThat(sysOut.asString(), containsString("can Waalk!!!"));
    }
}
