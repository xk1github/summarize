package pro;

import myTool.ArrayTool;

public class WordAnslly {
	String[][] data;
	String stats="1";
	String nowChar;
	String inStr;
public WordAnslly(String[][] data){
	this.data=data;
}
public void Init(String inStr){
	this.inStr=inStr;
	runWhile();
}
public void runWhile(){
	for(int i=0;i<inStr.length();i++){
		nowChar=String.valueOf(inStr.charAt(i));
		String searcher=Searcher();
		if(searcher.length()<3){
			stats=searcher;
			if(stats.equals("o")){
				System.out.println("ƥ�����");
				break;
			}
		}
		else{
			System.out.println(searcher);
			break;
		}
	}
	
}
public String Searcher(){
	String outStr="";
	for(int i=0;i<data.length;i++){
		if(data[i][0].equals(stats)){
			for(int j=0;j<ArrayTool.getColumn(data);j++){
				if(data[0][j].equals(nowChar)){
					outStr=data[i][j];
					if(outStr.equals("")){
						outStr="ѡ�е��ַ�Ϊ��";
					}
					break;
				}
			}
			if(outStr.equals("")){
				outStr="û������ַ�";
			}
			break;
		}
	}
	if(outStr.equals("")){
		outStr="û�����״̬";
	}
	return outStr;
	
}
}
