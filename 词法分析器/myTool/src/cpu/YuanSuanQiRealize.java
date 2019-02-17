package cpu;

public class YuanSuanQiRealize extends YuanSuanQi {

	@Override
	public void add(double a) {
		setLeiJiaQi(getLeiJiaQi()+a);
		
	}

	@Override
	public void delect(double a) {
		setLeiJiaQi(getLeiJiaQi()-a);
		
	}

	@Override
	public void cheng(double a) {
		setLeiJiaQi(getLeiJiaQi()*a);
		
	}

	@Override
	public void chu(double a) {
		setLeiJiaQi(getLeiJiaQi()/a);
		
	}

	@Override
	public void in(double a) {
		setLeiJiaQi(a);
		
	}

	@Override
	public void out() {
		setLeiJiaQi(0);
		
	}

}
