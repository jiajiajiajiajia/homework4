package shape;

public class rectangle extends shape{
	private int width;
	private int height;
	public rectangle(int width,int height) {
		this.height=height;
		this.width=width;
	}
	
	public rectangle() {
		
	}
	@Override
	public double getArea() {
		area=width*height;
		return area;
	}

	@Override
	public String getColor() {
		// TODO �Զ����ɵķ������
		return color;
	}

	@Override
	public double getPer() {
		per=(width+height)*2;
		return per;
	}

}
