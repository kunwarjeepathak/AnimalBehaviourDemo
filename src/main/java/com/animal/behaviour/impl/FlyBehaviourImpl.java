package com.animal.behaviour.impl;

import com.animal.behaviour.FlyBehaviour;

public class FlyBehaviourImpl implements FlyBehaviour{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("I am flying");
		
	}

	@Override
	public void cannotfly() {
		// TODO Auto-generated method stub
		System.out.println("Can not fly");
		
	}

}
