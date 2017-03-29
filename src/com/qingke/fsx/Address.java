package com.qingke.fsx;

public enum Address {
	FS(100,"¸ªÉ½"),SE(200,"Ê×¶û"),RC(300,"ÈÊ´¨");
	private double distance;
	public String chinaName;
	
	private Address(double distance,String name){
		this.distance = distance;
		chinaName = name;
	}

	public double getDistance() {
		return distance;
	}
  
}
