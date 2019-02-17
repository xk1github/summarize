package cpu;

import java.util.ArrayList;
import java.util.List;

public abstract class KongZhiQi {
private List<String> pc=new ArrayList<String>();
public abstract void addPc(String inStr);
public abstract void anslly(CunChuQiRealize cunChuQi);
public List<String> getPc() {
	return pc;
}
public void setPc(List<String> pc) {
	this.pc = pc;
}

}
