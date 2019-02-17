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
	if(talk.contains("龄")){
		System.out.println("我今年"+age+"岁了，你这个都不知道？");
		a=1;
	}
	if(talk.contains("会嘤嘤嘤吗")){
		System.out.println("会啊，嘤嘤嘤，要不要我捶你小胸口？");
		a=1;
	}
	if(talk.contains("姓名")||talk.contains("名字")){
		System.out.println(name);
		a=1;
	}
	if(a==0){
		System.out.println("你说什么我听不懂");
	}
}
}
