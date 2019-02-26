package com.animal.behaviour;

import org.junit.Before;
import org.junit.Test;

import com.animal.behaviour.birds.Chicken;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ChickenTest extends AbstractTest {


    Chicken chicken;

    @Before
    public void setUp(){
        this.chicken=new Chicken();
    }

    @Test
    public void testFly() {
        chicken.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void testSing() {
        chicken.sing();
        assertThat(sysOut.asString(), containsString("Cluck,cluck"));
    }
}
