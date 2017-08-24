package 抽象工厂模式;
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
