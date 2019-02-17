import java.awt.Point;

public class XiangShiQiRealize extends XiangShiQi{

	@Override
	public Object[] Init(int guanQianRuo, Point heightWideth) {
		guanQianRuo=1;
		heightWideth=new Point(500,300);
		Object[] obj={guanQianRuo,heightWideth};
		return obj;
	}

	@Override
	public Look getXiangShiQiString(String inStr) {
		Look look=new Look(inStr);
		look.setGuanQianRuo(getGuanQianRuo());
		look.setHeightWideth(getHeightWidth());
		return look;
	}

}
