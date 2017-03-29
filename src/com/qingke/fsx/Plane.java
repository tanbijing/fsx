package com.qingke.fsx;

import java.util.Random;

public class Plane extends Vehicle.AbstractVehicle implements Vehicle {
	
	@Override
	public double speedUp() {
		// TODO Auto-generated method stub
		Random ra =new Random();
		return ra.nextDouble()*ra.nextInt(4)+12;
	}

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return "·É»ú";
	}

}
