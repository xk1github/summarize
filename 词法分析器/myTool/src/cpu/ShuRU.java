package cpu;

public class ShuRU {
public static void main(String[] args) {
	KongZhiQiRealize kongZhiQi=new KongZhiQiRealize();
	kongZhiQi.addPc("0");
	kongZhiQi.addPc("1");
	kongZhiQi.addPc("2");
	kongZhiQi.addPc("3");
	
	CunChuQiRealize cunChuQi=new CunChuQiRealize();
	cunChuQi.write(0, "00024#");
	cunChuQi.write(1, "00035#");
	cunChuQi.write(2, "00016#");
	cunChuQi.write(3, "00116#");
	cunChuQi.write(4, "3");
	cunChuQi.write(5, "4");
	kongZhiQi.anslly(cunChuQi);
//	for(int i=0;i<cunChuQi.getCunChuData().length;i++){
//		System.out.println(cunChuQi.getCunChuData()[i]);
//	};
//	System.out.println(kongZhiQi.yuanSuanQi.getLeiJiaQi());
}
}
