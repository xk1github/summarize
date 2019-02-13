import myTool.ArrayTool;
import myTool.ExcelFile;
 
public class WordRealize extends Word {
	String[][] data;
	@Override
	public String[][] setData() {
		data=new ExcelFile().inExcel("E:/table.xls");
		
		return data;
	}
 
	@Override
	public String[] setName() {
		String[] name=new String[ArrayTool.getColumn(data)];
		return name;
	}
 
@Override
public void Next(String[][] data) {
	new WordAnslly(data).Init("b#");
}
public static void main(String[] args) {
	new WordRealize();
}
}
