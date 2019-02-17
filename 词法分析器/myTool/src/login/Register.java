package login;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import myTool.ItemPanel;

public abstract class Register extends JFrameMode{
	private JLabel lblName,lblPassword,lblPasswordOk,lblMassage;
	private JTextField txtName;
	private JPasswordField txtPassword,txtPasswordOk;
	private JButton btnFullsh,btnOk;
protected void Init(){
	lblName=new JLabel("�û���");
	lblPassword=new JLabel("����");
	lblPasswordOk=new JLabel("ȷ������");
	lblMassage=new JLabel("");
	txtName=new JTextField(10);
	txtPassword=new JPasswordField(10);
	txtPasswordOk=new JPasswordField(10);
	btnFullsh=new JButton("ˢ��");
	btnOk=new JButton("ȷ��");
	ItemPanel ip1=new ItemPanel(lblName,txtName);
	ip1.setLayout(new FlowLayout(FlowLayout.CENTER));
	ItemPanel ip2=new ItemPanel(lblPassword,txtPassword);
	ip2.setLayout(new FlowLayout(FlowLayout.CENTER));
	ItemPanel ip3=new ItemPanel(lblPasswordOk,txtPasswordOk);
	ip3.setLayout(new FlowLayout(FlowLayout.CENTER));
	ItemPanel ip4=new ItemPanel(btnFullsh,btnOk);
	ip4.setLayout(new FlowLayout(FlowLayout.CENTER));
	JComponent[] arrayPanel={ip1,ip2,ip3,ip4,lblMassage};
	ItemPanel ip5=new ItemPanel(new GridLayout(5, 1),arrayPanel);
	this.add(ip5);
	this.setBounds(500, 300, 500, 300);
	this.setVisible(true);
}
protected void btnFunction(){
	btnFullsh.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			txtName.setText("");
			txtPassword.setText("");
			txtPasswordOk.setText("");
		}
	});
	btnOk.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(!txtName.getText().equals("")&&!txtPassword.getText().equals("")&&!txtPasswordOk.getText().equals("")){
				if(txtPassword.getText().equals(txtPasswordOk.getText())){
					saveUser(txtName.getText(),txtPassword.getText());
				}
				else{
					lblMassage.setText("ȷ�����벻��ȷ");
				}
			}
			else{
				lblMassage.setText("����Ϊ��");
			}
			
		}
	});
}
protected abstract void saveUser(String Name,String Password);
}
