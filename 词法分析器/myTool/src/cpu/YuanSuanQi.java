package cpu;

public abstract class YuanSuanQi {
private double leiJiaQi;
public abstract void add(double a);
public abstract void delect(double a);
public abstract void cheng(double a);
public abstract void chu(double a);
public abstract void in(double a);
public abstract void out();
public double getLeiJiaQi() {
	return leiJiaQi;
}
public void setLeiJiaQi(double leiJiaQi) {
	this.leiJiaQi = leiJiaQi;
}

}
