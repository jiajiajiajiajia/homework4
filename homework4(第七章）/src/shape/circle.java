package shape;

public class circle extends shape{
	private int radius;
	private static double pai;
	static {
		pai=3.141592657;
	}
	public circle() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public circle(int radius) {
		this.radius=radius;
		// TODO �Զ����ɵĹ��캯�����
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
		// TODO �Զ����ɵķ������
		return area;
	}

	@Override
	public String getColor() {
		// TODO �Զ����ɵķ������
		return color;
	}

	@Override
	public double getPer() {
		per=pai*radius*2;
		// TODO �Զ����ɵķ������
		return per;
	}
	
	
}
