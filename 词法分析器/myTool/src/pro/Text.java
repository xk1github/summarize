package pro;

public abstract class Text {
	String[][] data;
	String word;
	String stats="1";
	String ch;
	public Text(){
		data=setData();
		word=setWord();
		run();
	}
public abstract String[][] setData();
public abstract String setWord();
private String searchByData(){
	String str="";
	for(int i=0;i<data.length;i++){
		if(data[i][0].equals(stats)){
			for(int j=0;j<getColumn(data);j++){
				if(data[0][j].equals(ch)){
					str=data[i][j];
				}
			}
		}
	}
	return str;
}
private void run(){
	for(int i=0;i<word.length();i++){
		ch=String.valueOf(word.charAt(i));
		String serchar=searchByData();
		if(!serchar.equals("")){
			if(serchar.equals("ok")){
				System.err.println("ok");
				break;
			}
			stats=serchar;
		}
		else{
			System.out.println(serchar);
		}
	}
}
public int getColumn(Object[][] object){
	int column=0;
	for(Object[] strin:object){
		column=strin.length;
		break;
	}
	return column;
}
}
