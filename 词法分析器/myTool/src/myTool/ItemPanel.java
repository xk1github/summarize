package myTool;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class ItemPanel extends JPanel{
//new 一个空的JPanel
public ItemPanel(){
	this.setLayout(new FlowLayout(FlowLayout.LEFT));
}
//+个组件的的JPanel容器
public ItemPanel(JComponent ...components){
	this.setLayout(new FlowLayout(FlowLayout.LEFT));
	for(JComponent component:components){
		this.add(component);
	}
}
//特定布局的含有*个组件的容器
public ItemPanel(LayoutManager mgr,JComponent[] arrayComponent){
	this.setLayout(mgr);
	for(int i=0;i<arrayComponent.length;i++){
		this.add(arrayComponent[i]);
	}
}
//在容器后增加+个组件
public void addItemPanel(JComponent ...components){
	for(JComponent component:components){
		this.add(component);
	}
}

}
