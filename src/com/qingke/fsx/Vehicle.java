package com.qingke.fsx;

import java.util.Random;

public interface Vehicle {
	double speedUp();
	public abstract class AbstractVehicle {
		public static Vehicle getVehicle(){
			Random ra =new Random();
			int random = ra.nextInt(11);
			Vehicle vehicle;
			if(9==random||random==10){
				vehicle = new Plane();
			}else if(5<=random&&random<=8){
				vehicle = new Train();
			}else{
				vehicle = new TuoLaJi();
			}
			return vehicle;
		}
		public abstract String getVehicleName();
	}
}
