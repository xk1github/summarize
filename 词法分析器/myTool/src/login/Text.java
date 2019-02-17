package login;


public class Text{
public Text(){
	Login login=new Login() {
		
		@Override
		void toDo() {
			new View(super.getTextName());
			
		}
		
		@Override
		boolean seacherUser(String userName, String userPassword) {
			// TODO Auto-generated method stub
			return true;
		}
		
		@Override
		void register() {
			new Register() {
				
				@Override
				protected void saveUser() {
					
				}
			};
			
		}
	};
}
public static void main(String[] args) {
	new Text();
}
}
