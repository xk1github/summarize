package myTool;

import java.awt.Point;
import java.util.List;

public class Seacher {
public boolean excelNamePassword(String name,String password,String path){
	boolean trueOk=false;
	String[][] data=new ExcelFile().inExcel(path);
	List<Point> userPoint=ArrayTool.SeacherByName(data, name);
	if(!userPoint.isEmpty()){
	for(int i=0;i<userPoint.size();i++){
		if(data[(int)userPoint.get(i).getX()][(int)userPoint.get(i).getY()+1].equals(password)){
			trueOk=true;
		}
		break;
	}
	}
	return trueOk;
}
}
