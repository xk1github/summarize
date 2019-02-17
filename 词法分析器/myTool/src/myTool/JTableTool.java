package myTool;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import text.ButtonService;
import text.Text1;
import view.Frame;
import view.ItemPanel;
import view.ScollPanel;

public class JTableTool extends JPanel{
	private Object[][] object=null;
	private Object[] name=null;
	DefaultTableModel model=null;
	JTable table=null;
	JScrollPane sp=null;
	public JTableTool(Object[][] object,Object[] name){
		this.object=object;
		this.name=name;
		model=new DefaultTableModel(object,name);
		table=new JTable(model);
		sp=new JScrollPane(table);
		this.add(sp);
	}
	public void AddColumn(Object columnName){
		model.addColumn(columnName);
		object=new Object[model.getRowCount()][model.getColumnCount()];
		SaveData();
		Object[] names=name;
		name=new Object[model.getColumnCount()];
		for(int i=0;i<names.length;i++){
			name[i]=names[i];
		}
		name[name.length-1]=columnName;
	}
	public void AddRow(Object[] rowData){
		if(rowData.length==name.length){
		model.addRow(rowData);
		SaveData();
		}
	}
	public  void SaveData(){
		object=new Object[model.getRowCount()][model.getColumnCount()];
		for(int i=0;i<model.getRowCount();i++){
			for(int j=0;j<model.getColumnCount();j++){
				object[i][j]=model.getValueAt(i, j);
			}
		}
	}
	public Object[][] getData(){
		return object;
	}
	public Object[] getNam(){
		return name;
	}
	public void changeModel(Object[][] object,Object[] name){
		this.object=object;
		this.name=name;
		model=new DefaultTableModel(object,name);
		table.setModel(model);
	}
}
