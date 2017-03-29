package com.qingke.fsx;

import java.util.Random;

public class Train extends Vehicle.AbstractVehicle implements Vehicle {

	@Override
	public double speedUp() {
		// TODO Auto-generated method stub
		Random ra =new Random();
		return ra.nextDouble()*ra.nextInt(5)+8;
	}

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return "»ð³µ";
	}

}
