package com.animal.behaviour;

import org.junit.Before;
import org.junit.Test;

import com.animal.behaviour.impl.Caterpillar;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CaterpillarTest extends AbstractTest{

    Caterpillar caterpillar;
    @Before
    public void setUp(){
        this.caterpillar=new Caterpillar();
    }

    @Test
    public void testWalk() {
        caterpillar.walk();
        assertThat(sysOut.asString(), containsString("can Waalk!!!"));
    }

    @Test
    public void testFly() {
        caterpillar.fly();
        assertThat(sysOut.asString(), containsString("I am flying"));
    }
}
