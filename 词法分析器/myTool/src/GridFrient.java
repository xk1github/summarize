import java.util.Scanner;

public abstract class GridFrient {
private String name="";
private String sex="";
private String age="";
private String character="";
private Scanner sc;
public GridFrient(){
	String[] init=Init(name,sex,age,character);
	name=init[0];
	sex=init[1];
	age=init[2];
	character=init[3];
	sc=new Scanner(System.in);
}
public abstract String[] Init(String nameInit,String sexInit,String ageInit,String characterInit);
public void chat(){
	int a=0;
	String talk=sc.nextLine();
	if(talk.contains("��")){
		System.out.println("�ҽ���"+age+"���ˣ����������֪����");
		a=1;
	}
	if(talk.contains("����������")){
		System.out.println("�ᰡ�������ӣ�Ҫ��Ҫ�Ҵ���С�ؿڣ�");
		a=1;
	}
	if(talk.contains("����")||talk.contains("����")){
		System.out.println(name);
		a=1;
	}
	if(a==0){
		System.out.println("��˵ʲô��������");
	}
}
}
