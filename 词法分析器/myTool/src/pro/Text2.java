package pro;

public class Text2 extends Text {

	@Override
	public String[][] setData() {
		String[][] str=new String[5][7];
		str[0][0]="1";
		str[1][1]="";
		return str;
	}

	@Override
	public String setWord() {
		
		return "aadsf#";
	}
public static void main(String[] args) {
	new Text2();
}
}
