package com.qingke.fsx;

public enum Address {
	FS(100,"��ɽ"),SE(200,"�׶�"),RC(300,"�ʴ�");
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
