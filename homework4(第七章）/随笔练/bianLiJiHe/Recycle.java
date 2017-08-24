package bianLiJiHe;

public class Recycle {
	private static Recycle recycle;
	private Recycle(){
		
	}
	public static Recycle getIns(){
		if (recycle==null)
				recycle=new Recycle();
		return recycle;}

}
