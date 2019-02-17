import java.util.ArrayList;
import java.util.List;

public class JianPang {
private List<AnJiang> listAnJiang=new ArrayList<AnJiang>();
private void setListAnJiang(){
	String num="abcdefghigklmnopqrstuvwxyz0123456789";
	for(int i=0;i<num.length();i++){
		String numChar=String.valueOf(num.charAt(i));
		listAnJiang.add(new AnJiang() {
			
			@Override
			public String Init(String num) {
				
				return numChar;
			}
		});
	}
}
public String getJianPangString(AnJiang[] anjiangs){
	String jianPangString="";
	for(AnJiang anjiang:anjiangs){
		for(int i=0;i<listAnJiang.size();i++){
			if(anjiang.getNum().equals(listAnJiang.get(i).getNum())){
				jianPangString+=anjiang.getNum();
				break;
			}
		}
	}
	return jianPangString;
}
}
