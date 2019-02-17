import java.awt.Point;

public abstract class XiangShiQi {
	private int guanQianRuo;
	private Point heightWidth;
	public XiangShiQi(){
		Object[] obj=Init(guanQianRuo,heightWidth);
		guanQianRuo=(int)obj[0];
		heightWidth=(Point)obj[1];
	}
public abstract Object[] Init(int guanQianRuo,Point heightWideth);
public abstract Look getXiangShiQiString(String inStr);
public int getGuanQianRuo() {
	return guanQianRuo;
}
public void setGuanQianRuo(int guanQianRuo) {
	this.guanQianRuo = guanQianRuo;
}
public Point getHeightWidth() {
	return heightWidth;
}
public void setHeightWidth(Point heightWidth) {
	this.heightWidth = heightWidth;
}

}
