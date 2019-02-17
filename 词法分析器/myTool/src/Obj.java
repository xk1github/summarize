
public abstract class Obj {
private Look look;
private Computer computer;
public Obj(){
	computer=Init(computer);
	AnJiang[] anjiangs=setJiangPangString("askdfjash");
	look=computer.getLook(anjiangs);
	System.out.println(look.getGuanQianRuo()+","+look.getHeightWideth()+","+look.getXiangShiQiString());
}
public abstract Computer Init(Computer computer);
public AnJiang action(int N,String numN){
	AnJiang anjiang=new AnJiang() {
		
		@Override
		public String Init(String num) {
			// TODO Auto-generated method stub
			return numN;
		}
	};
	anjiang.press(N);
	return anjiang;
}
public AnJiang[] setJiangPangString(String inStr){
	AnJiang[] anjiangs=new AnJiang[inStr.length()];
	int n=100;
	for(int i=0;i<inStr.length();i++){
		String nowStr=String.valueOf(inStr.charAt(i));
		anjiangs[i]=action(n, nowStr);
	}
	return anjiangs;
}
}
