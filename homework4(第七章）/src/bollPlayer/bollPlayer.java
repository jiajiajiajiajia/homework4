package bollPlayer;

public class bollPlayer {
	
	public static int sum;
	public bollPlayer() {
		sum=sum+1;
		if(sum>11) {
			System.out.println("已经创立了11个对象了，不能在创建了。");
		}else {
			System.out.println("您创建了一个对象球员。");
		}

	}
}


