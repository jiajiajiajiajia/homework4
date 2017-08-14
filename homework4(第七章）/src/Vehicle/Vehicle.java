package Vehicle;

import java.net.PortUnreachableException;

public class Vehicle {
	protected String brand;
	protected String color;
	protected double speed;
	
	
	public void setBrand(String brand) {//怎么写只能设置一次，再也不能修改
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
		
	}
	public void setColor( String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
		
	}
	public Vehicle(String brand, String color,double speed) {
		this.brand=brand;
		this.color=color;
		this.speed=speed=0;
	}
	public Vehicle() {
	}
	
	public void run() {
		System.out.println(color+"的"+brand+"可以跑到很快哦~"+"。   速度是："+speed);
	}
	

}