package com.qingke.fsx;

public class Person extends Role {
	@Override
	public double go(Address add) {
		// TODO Auto-generated method stub
//		double day = 0;
//		double goLong = 0;
//		while(true){
			Vehicle vehicle = Vehicle.AbstractVehicle.getVehicle();
			double up = vehicle.speedUp();
//			if ((add.getDistance()-goLong)<(speed+up)){
//				day += (add.getDistance()-goLong)/(speed+up);
//			}else{
//				day += 1;
//			}
//			goLong += speed+up;
			System.out.println("交通工具:"+vehicle+",加速"+vehicle.speedUp());
//			if(goLong>=add.getDistance()) break;
			return add.getDistance()/(speed+up);
//		}
//		return day;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", speed=" + speed + "]";
	}
	
}
