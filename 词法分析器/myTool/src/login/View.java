package login;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import myTool.ItemPanel;

public class View extends JFrame{
	private JButton btnIn;
public View(String userName){
		Init();
		btnFuntion();
}
private void Init(){
	btnIn=new JButton("µº»Î");
	ItemPanel iPanel=new ItemPanel(btnIn);
	this.add(iPanel,BorderLayout.NORTH);
	this.setBounds(500, 300, 500, 300);
	this.setVisible(true);
}
private void btnFuntion(){
	btnIn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});
}
}
