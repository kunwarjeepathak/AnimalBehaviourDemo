package com.animal.behaviour;

import org.junit.Before;
import org.junit.Test;

import com.animal.behaviour.birds.Chicken;
import com.animal.behaviour.birds.Duck;
import com.animal.behaviour.birds.Parrot;
import com.animal.behaviour.birds.Rooster;
import com.animal.behaviour.fish.Clownfish;
import com.animal.behaviour.fish.Dolphin;
import com.animal.behaviour.fish.Shark;
import com.animal.behaviour.impl.Butterfly;
import com.animal.behaviour.impl.Cat;
import com.animal.behaviour.impl.Dog;
import com.animal.behaviour.impl.Frog;
import com.animal.behaviour.model.Bird;
import com.animal.behaviour.model.Fish;
import com.animal.behaviour.model.Parent;
import com.animal.behaviour.util.CountAnimals;

import static org.junit.Assert.assertEquals;

public class CountingTest extends AbstractTest {

    CountAnimals countAnimals;
    Parent animals[] ;

    @Before
    public  void setUp(){
        this.countAnimals=new CountAnimals();
        animals = new Parent[]{
                new Bird(),  //  SING, FLY ,WALK
                new Duck(),  //  SING, FLY ,WALK, SWIM
                new Chicken(), // SING, FLY ,WALK
                new Rooster(), // SING, FLY ,WALK
                new Parrot(), //SING, FLY ,WALK
                new Fish(), // SWIM
                new Shark(), // SWIM
                new Clownfish(), // SWIM
                new Dolphin(), // SWIM
                new Frog(), // SING WALK
                new Dog(), // SING WALK
                new Butterfly(), // FLY WALK
                new Cat()  // SING WALK
        };
    }

    @Test
    public void testWalkableCount(){
        int count= this.countAnimals.walkCount(animals);
        assertEquals(13,count);
    }

    @Test
    public void testFlyableCount(){
        int count= this.countAnimals.flyCount(animals);
        assertEquals(6,count);
    }

    @Test
    public void testSingableCount(){
        int count= this.countAnimals.singCount(animals);
        assertEquals(13,count);
    }

    @Test
    public void testSwimmableCount(){
        int count= this.countAnimals.swimCount(animals);
        assertEquals(5,count);
    }
}
