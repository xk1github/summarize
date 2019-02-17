package cpu;

public class CunChuQiRealize extends CunChuQi{

	@Override
	public String[] Init(String[] cunChuData) {
		cunChuData=new String[100];
		return cunChuData;
	}

	@Override
	public String read(int adress) {
		String readStr=getCunChuData()[adress];
		return readStr;
	}

	@Override
	public void write(int adress, String data) {
		getCunChuData()[adress]=data;
	}

}
