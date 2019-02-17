
public class ObjRealize extends Obj {

	@Override
	public Computer Init(Computer computer) {
		return new Computer();
	}
public static void main(String[] args) {
	new ObjRealize();
}
}
