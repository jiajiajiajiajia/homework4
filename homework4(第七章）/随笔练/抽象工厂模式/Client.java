package 抽象工厂模式;
public class Client {
	public static void main(String[] args) {
		BClass che ;
		Factory factory = new FactoryCN();
		che = factory.bClass();
	}
}
