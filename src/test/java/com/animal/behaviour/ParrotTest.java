package com.animal.behaviour;

import org.junit.Before;
import org.junit.Test;

import com.animal.behaviour.birds.Parrot;
import com.animal.behaviour.impl.CatSound;
import com.animal.behaviour.impl.DogSound;
import com.animal.behaviour.impl.DuckSound;
import com.animal.behaviour.impl.RoosterSound;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ParrotTest extends AbstractTest {


    Parrot parrot;

    @Before
    public void setUp(){
        parrot= new Parrot();
    }

    @Test
    public void testParrotLivingWithDog(){
        parrot.setSingBehaviour(new DogSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Woof,woof"));

    }


    @Test
    public void testParrotLivingWithCat(){
        parrot.setSingBehaviour(new CatSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Meow"));
    }


    @Test
    public void testParrotLivingWithRooster(){
        parrot.setSingBehaviour(new RoosterSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Cock-a-doodle-doo"));
    }

    @Test
    public void testParrotLivingWithDuck(){
        parrot.setSingBehaviour(new DuckSound());
        parrot.sing();
        assertThat(sysOut.asString(), containsString("Quack,quack"));
    }

}
