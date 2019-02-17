package myTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFile {
	//导入excel文件
public String[][] inExcel(String filePath){
	String[][] string=null;
	File file=new File(filePath);
	try {
		FileInputStream in=new FileInputStream(file);
		Workbook workbook=Workbook.getWorkbook(in);
		Sheet sheet=workbook.getSheet(0);
		int columns=sheet.getColumns();
		int rows=sheet.getRows();
		string=new String[rows][columns];
		for(int i=0;i<columns;i++){
			for(int j=0;j<rows;j++){
				string[j][i]=sheet.getCell(i, j).getContents();
			}
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (BiffException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return string;
}
//导出excel文件
public void outExcel(String[][] string,String filePath,String ExcelName){
	File file=new File(filePath);
	try {
		OutputStream out=new FileOutputStream(file);
		WritableWorkbook workbook=Workbook.createWorkbook(out);
		WritableSheet sheet=workbook.createSheet(ExcelName, workbook.getSheetNames().length);
		int i=0;
		int j=0;
		for(String[] strin:string){
			for(String str:strin){
				sheet.addCell(new Label(j, i, string[i][j]));
				j++;
			}
			j=0;
			i++;
		}
		workbook.write();
		workbook.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RowsExceededException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (WriteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
//复制excel文件
public void changeSave(String path1,String path2){
		String[][] inStr=new ExcelFile().inExcel(path1);
		new ExcelFile().outExcel(inStr, path2, "table");
}
}
