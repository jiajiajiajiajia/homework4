package ���󹤳�ģʽ;

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
