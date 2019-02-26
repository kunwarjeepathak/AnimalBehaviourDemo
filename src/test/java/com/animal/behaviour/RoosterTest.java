package com.animal.behaviour;

import org.junit.Before;
import org.junit.Test;

import com.animal.behaviour.birds.Rooster;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class RoosterTest extends AbstractTest{


    Rooster rooster;

    @Before
    public void setUp(){
        this.rooster=new Rooster();
    }

    @Test
    public void testFly() {
        rooster.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }

    @Test
    public void testSing() {
        rooster.sing();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }

}
