package com.animal.behaviour;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.animal.behaviour.birds.Duck;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class DuckTest {

    @Rule
    public SystemOutResource sysOut = new SystemOutResource();
    Duck duck;

    @Before
    public void setUp() {
        this.duck=  new Duck();
    }


    @Test
    public void testSing() {
        duck.sing();
        assertThat(sysOut.asString(), containsString("Quack,quack"));
    }

    @Test
    public void testSwim() {
        duck.swim();
        assertThat(sysOut.asString(), containsString("Great swimmers"));
    }


}
