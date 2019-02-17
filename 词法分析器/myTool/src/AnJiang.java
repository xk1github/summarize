
public abstract class AnJiang {
private String num;
public AnJiang(){
	Init(num);
	
}
public abstract String Init(String num);
public String press(int N){
	String numN;
	if(N>50){
		numN=num;
	}
	else{
		numN="Á¦Ì«Ğ¡";
	}
	return num;
}
public String getNum(){
	return num;
}
}

