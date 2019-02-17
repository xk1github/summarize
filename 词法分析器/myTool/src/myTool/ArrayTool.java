package myTool;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class ArrayTool {
	//������ʼλ�úͽ���λ�ý�ȡ��������
	public Object[][] getSomeArray(int startRow,int startColumn,int endRow,int endColumn,Object[][] inStr){
		int row=endRow-startRow+1;
		int column=endColumn-startColumn+1;
		Object[][] object=new Object[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				object[i][j]=inStr[i+startRow][j+startColumn];
			}
		}
		return object;
	}
	//�����кŽ�ȡ����
	public static Object[][] getSomeArrayRow(int[] rowNums,Object[][] inStr){
		Object[][] data=new Object[rowNums.length][ArrayTool.getColumn(inStr)];
		for(int i=0;i<ArrayTool.getColumn(data);i++){
			for(int j=0;j<rowNums.length;j++){
				data[j][i]=inStr[rowNums[j]][i];
			}
		}
		return data;
	}
	//�����кŽ�ȡ����
	public static Object[][] getSomeArrayColumn(int[] columnNums,Object[][] inStr){
		Object[][] data=new Object[inStr.length][columnNums.length];
		int a=0;
		for(int i=0;i<data.length;i++){
			for(int j=0;j<columnNums.length;j++){
				data[i][j]=inStr[i][columnNums[j]];
			}
		}
		return data;
	}
	//���кϲ���������
	public static Object[][] changeToOneRow(Object[][] inStr1,Object[][] inStr2){
		Object[][] data=null;
		if(ArrayTool.getColumn(inStr1)==ArrayTool.getColumn(inStr2)){
			data=new Object[inStr1.length+inStr2.length][ArrayTool.getColumn(inStr1)];
			for(int i=0;i<inStr1.length;i++){
				for(int j=0;j<ArrayTool.getColumn(inStr1);j++){
					data[i][j]=inStr1[i][j];
				}
			}
			for(int i=0;i<inStr2.length;i++){
				for(int j=0;j<ArrayTool.getColumn(inStr2);j++){
					data[i+inStr1.length][j]=inStr2[i][j];
				}
			}
		}
		else{
			System.out.println("��������������ͬ");
		}
		return data;
	}
	//���кϲ���������
	public static Object[][] changeToOneColumn(Object[][] inStr1,Object[][] inStr2){
		Object[][] data=null;
		if(inStr1.length==inStr2.length){
			data=new Object[inStr1.length][ArrayTool.getColumn(inStr1)+ArrayTool.getColumn(inStr2)];
			for(int i=0;i<inStr1.length;i++){
				for(int j=0;j<ArrayTool.getColumn(inStr1);j++){
					data[i][j]=inStr1[i][j];
				}
			}
			for(int i=0;i<inStr2.length;i++){
				for(int j=0;j<ArrayTool.getColumn(inStr2);j++){
					data[i][j+ArrayTool.getColumn(inStr1)]=inStr2[i][j];
				}
			}
		}
		else{
			System.out.println("��������������ͬ");
		}
		return data;
	}
	//�������ֲ����������е�λ��
	public static List<Point> SeacherByName(Object[][] inStr,Object name){ 
		List<Point> list=new ArrayList<Point>();
		for(int i=0;i<inStr.length;i++){
			for(int j=0;j<ArrayTool.getColumn(inStr);j++){
				if(name.equals(inStr[i][j])){
					Point point=new Point(i, j);
					list.add(point);
				}
			}
		}
		return list;
	}
	//�õ���ֵ������
	public static int getColumn(Object[][] object){
		int column=0;
		for(Object[] strin:object){
			column=strin.length;
			break;
		}
		return column;
	}
}
