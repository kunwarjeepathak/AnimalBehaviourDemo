package com.animal.behaviour;

import org.junit.Before;
import org.junit.Test;

import com.animal.behaviour.model.Fish;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class FishTest extends AbstractTest {

    Fish fish;


    @Before
    public void setUp(){
        fish=new Fish();
    }


    @Test
    public void testWalk() {
        fish.walk();
        assertThat(sysOut.asString(), containsString("can Waalk!!!"));
    }

    @Test
    public void testSing() {
        fish.sing();
        assertThat(sysOut.asString(), containsString("I am singing"));
    }

    @Test
    public void testSwim() {
        fish.swim();
        assertThat(sysOut.asString(), containsString("Great swimmers"));
    }
}
