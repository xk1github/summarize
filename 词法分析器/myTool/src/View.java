import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import login.JFrameMode;
import myTool.ItemPanel;

public class View extends JFrameMode {
	ItemPanel iPanel;
	JButton btn1;
	GridFriendRealize grilFriend;
@Override
protected void Init() {
	btn1=new JButton("¶Ô»°");
	iPanel=new ItemPanel(btn1);
	this.add(iPanel);
	this.pack();
	this.setVisible(true);
	grilFriend=new GridFriendRealize();
}

@Override
protected void btnFunction() {
	btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			grilFriend.chat();
		}
	});
	
}
public static void main(String[] args) {
	new View();
}
}
