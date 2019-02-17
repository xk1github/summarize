package pro;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import myTool.ItemPanel;

public abstract class Word extends JFrame{
	JTable table;
	JButton btn1,btn2,btn3;
	JScrollPane sPanel;
	DefaultTableModel mode;
public Word(){
	Init();
	btnFunction();
}
private void Init(){
	String[][] data=setData();
	String[] name=setName();
	btn1=new JButton("增加一列");
	btn2=new JButton("增加一行");
	btn3=new JButton("保存");
	mode=new DefaultTableModel(data, name);
	table=new JTable(mode);
	sPanel=new JScrollPane(table);
	this.add(sPanel);
	ItemPanel iPanel=new ItemPanel(btn1,btn2,btn3);
	this.add(iPanel,BorderLayout.SOUTH);
	this.setBounds(500, 300, 500, 300);
	this.setVisible(true);
}
private void btnFunction(){
	btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			mode.addColumn("null");
		}
	});
	btn2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String[] str=new String[mode.getColumnCount()];
			mode.addRow(str);
			
		}
	});
	btn3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
	    String[][] inStr=new String[mode.getRowCount()][mode.getColumnCount()];
			for(int i=0;i<mode.getRowCount();i++){
				for(int j=0;j<mode.getColumnCount();j++){
					inStr[i][j]=(String)mode.getValueAt(i, j);
				}
			}
			Next(inStr);
		}
	});
}
public abstract String[][] setData();
public abstract String[] setName();
public abstract void Next(String[][] data);
}
