package cpu;

public abstract class CunChuQi {
private String[] cunChuData;
public CunChuQi(){
	cunChuData=Init(cunChuData);
}
public abstract String[] Init(String[] cunChuData);
public abstract String read(int adress);
public abstract void write(int adress,String data);
public String[] getCunChuData(){
	return cunChuData;
}
}
