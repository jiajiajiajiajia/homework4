package 抽象工厂模式;

public class FactoryGE implements Factory{

	@Override
	public AClass aClass() {
		
		return new AClassGE();
	}

	@Override
	public BClass bClass() {
		return new BClassGE();
	}

}
