package com.qingke.fsx;

public abstract class Role {
	public String name;
	public double speed;
	public abstract double go(Address add);
	public Role(){
		speed = 2;
	}
}
