package com.animal.behaviour;

import org.junit.Before;
import org.junit.Test;

import com.animal.behaviour.fish.Clownfish;
import com.animal.behaviour.util.Color;
import com.animal.behaviour.util.Size;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class ClownfishTest extends AbstractTest{


    Clownfish clownfish;


    @Before
    public void setUp(){
        this.clownfish=new Clownfish();
    }


    @Test
    public void testWalk() {
        clownfish.walk();
        assertThat(sysOut.asString(), containsString("can Waalk!!!"));
    }

    @Test
    public void testSing() {
        clownfish.sing();
        assertThat(sysOut.asString(), containsString("I am singing"));
    }

    @Test
    public void testSwim() {
        clownfish.swim();
        assertThat(sysOut.asString(), containsString("Great swimmers"));
    }

    @Test
    public void testSize() {
        Size size= clownfish.size();
        assertEquals(Size.SMALL,size);
    }

    @Test
    public void testColor() {
        Color color= clownfish.color();
        assertEquals(Color.ORANGE,color);
    }
}
