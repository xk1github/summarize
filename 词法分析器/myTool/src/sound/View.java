package sound;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;

import login.JFrameMode;
import myTool.ItemPanel;

public class View extends JFrameMode{
private JLabel lbl1,lbl2,lbl3;
private JSlider slider;
private JTextArea txtArea;
	@Override
	protected void Init() {
		lbl1=new JLabel(new ImageIcon(new ImageIcon("./icon/9.png").getImage()));
		lbl2=new JLabel(new ImageIcon(new ImageIcon("./icon/6.png").getImage()));
		lbl3=new JLabel(new ImageIcon(new ImageIcon("./icon/bofang.png").getImage()));
		slider=new JSlider(JSlider.HORIZONTAL,0, 100, 50);
		txtArea=new JTextArea(50,30);
		JScrollPane scPanel=new JScrollPane(txtArea);
		JPanel sliderPanel=new JPanel();
		sliderPanel.add(slider);
		ItemPanel iPanel=new ItemPanel(lbl1,lbl2,lbl3);
		JPanel pSouth=new JPanel();
		pSouth.setLayout(new GridLayout(2, 1));
		pSouth.add(sliderPanel);
		pSouth.add(iPanel);
		iPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.add(scPanel);
		this.add(pSouth,BorderLayout.SOUTH);
		this.setBounds(500, 300, 300, 500);
		this.setVisible(true);
	}

	@Override
	protected void btnFunction() {
		lbl1.addMouseListener(new MouseLister() {
			
			@Override
			public void mousePress(MouseEvent e) {
				
				
			}
		});
		lbl2.addMouseListener(new MouseLister() {
			
			@Override
			public void mousePress(MouseEvent e) {
				new Test("E:/ljj.wav");
				
			}
		});
		lbl3.addMouseListener(new MouseLister() {
			
			@Override
			public void mousePress(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		slider.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
public static void main(String[] args) {
	new View();
}
}
