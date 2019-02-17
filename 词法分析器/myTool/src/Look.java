import java.awt.Point;

public class Look {
private int guanQianRuo;
private Point heightWideth;
private String xiangShiQiString;
public Look(String xiangShiQiString){
	this.xiangShiQiString=xiangShiQiString;
}
public int getGuanQianRuo() {
	return guanQianRuo;
}
public void setGuanQianRuo(int guanQianRuo) {
	this.guanQianRuo = guanQianRuo;
}
public Point getHeightWideth() {
	return heightWideth;
}
public void setHeightWideth(Point heightWideth) {
	this.heightWideth = heightWideth;
}
public String getXiangShiQiString() {
	return xiangShiQiString;
}
public void setXiangShiQiString(String xiangShiQiString) {
	this.xiangShiQiString = xiangShiQiString;
}

}
