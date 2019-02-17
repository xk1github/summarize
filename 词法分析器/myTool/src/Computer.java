
public class Computer {
private JianPang jianPane;
private XiangShiQiRealize xiangShiQi;
public Computer(){
	Init();
}
private void Init(){
	jianPane=new JianPang();
	xiangShiQi=new XiangShiQiRealize();
}
public Look getLook(AnJiang[] anjians){
	String inStr=jianPane.getJianPangString(anjians);
	Look look=xiangShiQi.getXiangShiQiString(inStr);
	return look;
}
}
