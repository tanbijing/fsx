package com.qingke.fsx;

import java.util.Random;

public class Zombie extends Role {
	@Override
	public double go(Address add) {
		// TODO Auto-generated method stub
		return add.getDistance()/speed;
	}
	
	public Zombie(){
		Random ra =new Random();
		speed =  ra.nextDouble()*ra.nextInt(6)+3;
	}

	@Override
	public String toString() {
		return "Zombie [name=" + name + ", speed=" + speed + "]";
	}

}
