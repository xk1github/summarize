package cpu;

import java.util.List;
import java.util.Scanner;

public class KongZhiQiRealize extends KongZhiQi{
	YuanSuanQiRealize yuanSuanQi;
	@Override
	public void addPc(String inStr) {
		getPc().add(inStr);
	}

	@Override
	public void anslly(CunChuQiRealize cunChuQi) {
		yuanSuanQi=new YuanSuanQiRealize();
		List<String> pc=getPc();
		for(int i=0;i<pc.size();i++){
			String minLing=cunChuQi.read(Integer.parseInt(pc.get(i)));
			byStartNum(minLing, cunChuQi);
		}
		
	}
	private void byStartNum(String minLing,CunChuQiRealize cunChuQi){
		int adress=0;
		String startNum=minLing.substring(0, 4);
		String endNum=minLing.substring(4, 6);
		endNum=endNum.replace("#", "");
		if(!endNum.equals("")){
			adress=Integer.parseInt(endNum);
		}
		switch (startNum) {
		//存数
		case "0001":cunChuQi.write(adress, String.valueOf(yuanSuanQi.getLeiJiaQi()));
			
			break;
		//取数
		case "0002":yuanSuanQi.setLeiJiaQi(Integer.parseInt(cunChuQi.read(adress)));
			
			break;
		//加
		case "0003":yuanSuanQi.add(Double.parseDouble(cunChuQi.read(adress)));
			
			break;
		case "0004":
			
			break;
		//减
		case "0005":yuanSuanQi.delect(Double.parseDouble(cunChuQi.read(adress)));
			
			break;
		//乘
		case "0006":yuanSuanQi.cheng(Double.parseDouble(cunChuQi.read(adress)));
			
			break;
		//除
		case "0007":yuanSuanQi.chu(Double.parseDouble(cunChuQi.read(adress)));
				
			break;
		//退出
		case "0008":System.exit(0);
				
			break;
		//跳转
		case "0009":
				
			break;
		//io输入
		case "0010":Scanner sc=new Scanner(System.in);
		cunChuQi.write(adress, sc.nextLine());
			break;
		//io输出
		case "0011":System.out.println(cunChuQi.read(adress));
				
			break;

		default:
			break;
		}
	}

}
