package login;

import java.awt.Point;
import java.util.List;

import javax.swing.JLabel;

import myTool.ArrayTool;
import myTool.ExcelFile;
import myTool.Seacher;

public class LoginRelize {
	public LoginRelize(){
	new Login() {
		
		@Override
		void toDo() {
			new View(super.getTextName());
			
		}
		@Override
		boolean seacherUser(String userName, String userPassword) {
			boolean trueOk=new Seacher().excelNamePassword(userName, userPassword, "E:/a.xls");
			return trueOk;
		}
		@Override
		void register() {
			new Register() {
				
				@Override
				protected void saveUser(String Name, String Password) {
				     String[][] data=new ExcelFile().inExcel("E:/a.xls");
					
					
				}
			};
		}
	};
	}
	public static void main(String[] args) {
		new LoginRelize();
	}
}
