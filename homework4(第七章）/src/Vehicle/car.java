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
		System.out.println(color+"��"+"������"+loader+"���˵�"+brand+"�����ܵ��ܿ�Ŷ~"+"��   �ٶ��ǣ�"+speed);
	}
	
}
