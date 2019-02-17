package myTool;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class ItemPanel extends JPanel{
//new һ���յ�JPanel
public ItemPanel(){
	this.setLayout(new FlowLayout(FlowLayout.LEFT));
}
//+������ĵ�JPanel����
public ItemPanel(JComponent ...components){
	this.setLayout(new FlowLayout(FlowLayout.LEFT));
	for(JComponent component:components){
		this.add(component);
	}
}
//�ض����ֵĺ���*�����������
public ItemPanel(LayoutManager mgr,JComponent[] arrayComponent){
	this.setLayout(mgr);
	for(int i=0;i<arrayComponent.length;i++){
		this.add(arrayComponent[i]);
	}
}
//������������+�����
public void addItemPanel(JComponent ...components){
	for(JComponent component:components){
		this.add(component);
	}
}

}
