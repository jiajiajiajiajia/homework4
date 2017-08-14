package Vehicle;

public class car extends Vehicle{
	private int loader;
	public car(String brand,String color,double speed,int loader) {
		super( brand,color,speed) ;
		this.loader=loader;
//		this.brand=brand;
//		this.color=color;
//		this.speed=speed;
	}
	public void run() {
		System.out.println(color+"的"+"可以坐"+loader+"个人的"+brand+"可以跑到很快哦~"+"。   速度是："+speed);
	}
	
}
