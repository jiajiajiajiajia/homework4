package shape;

public class circle extends shape{
	private int radius;
	private static double pai;
	static {
		pai=3.141592657;
	}
	public circle() {
		// TODO 自动生成的构造函数存根
	}
	public circle(int radius) {
		this.radius=radius;
		// TODO 自动生成的构造函数存根
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		area=pai*radius*radius;
		// TODO 自动生成的方法存根
		return area;
	}

	@Override
	public String getColor() {
		// TODO 自动生成的方法存根
		return color;
	}

	@Override
	public double getPer() {
		per=pai*radius*2;
		// TODO 自动生成的方法存根
		return per;
	}
	
	
}
