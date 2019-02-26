package com.animal.behaviour;

import org.junit.Before;
import org.junit.Test;

import com.animal.behaviour.fish.Dolphin;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class DolphinTest extends AbstractTest {


    Dolphin dolphin;
    @Before
    public void setUp(){
        this.dolphin=new Dolphin();
    }


    @Test
    public void testWalk() {
        dolphin.walk();
        assertThat(sysOut.asString(), containsString("can Waalk!!!"));
    }

    @Test
    public void testSing() {
        dolphin.sing();
        assertThat(sysOut.asString(), containsString("I am singing"));
    }


    @Test
    public void testSwim() {
        dolphin.swim();
        assertThat(sysOut.asString(), containsString("Great swimmers"));
    }
}


