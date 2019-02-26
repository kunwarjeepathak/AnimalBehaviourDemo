package com.animal.behaviour;

import org.junit.Before;
import org.junit.Test;

import com.animal.behaviour.fish.Shark;
import com.animal.behaviour.util.Color;
import com.animal.behaviour.util.Size;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class SharkTest extends AbstractTest {


    Shark shark;


    @Before
    public void setUp(){
        shark=new Shark();
    }


    @Test
    public void testWalk() {
        shark.walk();
        assertThat(sysOut.asString(), containsString("can Waalk!!!"));
    }

    @Test
    public void testSing() {
        shark.sing();
        assertThat(sysOut.asString(), containsString("I am singing"));
    }

    @Test
    public void testSwim() {
        shark.swim();
        assertThat(sysOut.asString(), containsString("Great swimmers"));
    }

    @Test
    public void testSize() {
        Size size= shark.size();
       assertEquals(Size.LARGE,size);
    }

    @Test
    public void testColor() {
        Color color= shark.color();
        assertEquals(Color.GREY,color);
    }

}
