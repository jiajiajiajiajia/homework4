package ���󹤳�ģʽ;
public class FactoryCN implements Factory{
	@Override
	public AClass aClass() {
		return new AClassCN();
	}
	@Override
	public BClass bClass() {
		return new BClassCN();
	}
}
