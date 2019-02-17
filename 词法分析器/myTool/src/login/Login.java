package login;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import myTool.ItemPanel;

public abstract class Login extends JFrameMode{
	private JLabel lblName,lblPassword,lblMessage;
	private JTextField txtName;
	private JPasswordField txtPassword;
	private JButton btnRegister,btnOk;
protected void Init(){
	lblName=new JLabel("�û���");
	lblPassword=new JLabel("����");
	lblMessage=new JLabel("");
	txtName=new JTextField(10);
	txtPassword=new JPasswordField(10);
	btnRegister=new JButton("ע��");
	btnOk=new JButton("ȷ��");
	ItemPanel ip1=new ItemPanel(lblName,txtName);
	ip1.setLayout(new FlowLayout(FlowLayout.CENTER));
	ItemPanel ip2=new ItemPanel(lblPassword,txtPassword);
	ip2.setLayout(new FlowLayout(FlowLayout.CENTER));
	ItemPanel ip3=new ItemPanel(btnRegister,btnOk);
	ip3.setLayout(new FlowLayout(FlowLayout.CENTER));
	JComponent[] arrayPanel={ip1,ip2,ip3,lblMessage};
	ItemPanel ip4=new ItemPanel(new GridLayout(4, 1),arrayPanel);
	this.add(ip4);
	this.setBounds(500, 300, 500, 300);
	this.setVisible(true);
}
protected void btnFunction(){
	btnRegister.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			register();
			
		}
	});
	btnOk.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(!txtName.getText().equals("")&&!txtPassword.getText().equals("")){
				if(seacherUser(txtName.getText(), txtPassword.getText())){
					toDo();
				}
				else{
					lblMessage.setText("�û��������벻��ȷ");
				}
			}
			else{
				lblMessage.setText("����Ϊ��");
			}
		}
	});
}
public String getTextName(){
	return txtName.getText();
}
//���ע�ᰴť
abstract void register();
//�����û��Ƿ����
abstract boolean seacherUser(String userName,String userPassword);
//��¼�ɹ���Ĳ���
abstract void toDo();
}
