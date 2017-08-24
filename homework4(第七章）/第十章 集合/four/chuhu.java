package four;

import java.util.Collection;

public class chuhu {
	int id;
	String name;
	int yue;
	public chuhu(int id, String name, int yue) {
		super();
		this.id = id;
		this.name = name;
		this.yue = yue;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", yue=" + yue + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYue() {
		return yue;
	}
	public void setYue(int yue) {
		this.yue = yue;
	}
	

}
