package shape;

public abstract class shape {
	protected double area;
	protected double per;
	protected String color;
	public abstract double getArea();
	public abstract String getColor();
	public abstract double getPer();
	public void showAll() {
		System.out.println("�ҵ�����ǣ�"+getArea()+"  �ҵ��ܳ��ǣ�"+getPer()+"   �ҵ���ɫ�ǣ�"+getColor());
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
