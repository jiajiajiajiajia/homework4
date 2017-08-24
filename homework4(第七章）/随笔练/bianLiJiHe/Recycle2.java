package bianLiJiHe;

public class Recycle2 {
	private static Recycle2 recycle = new Recycle2();
	private Recycle2() {}
	public static Recycle2 getInstencs() {
		return recycle;
		
	}

}
