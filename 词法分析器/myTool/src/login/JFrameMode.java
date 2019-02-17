package login;

import javax.swing.JFrame;

public abstract class JFrameMode extends JFrame{
public JFrameMode(){
	Init();
	btnFunction();
}
protected abstract void Init();
protected abstract void btnFunction();
}
