package JavaSessions;

public class LoginPage {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.loginOTP(234);
		
		


	}
  public void login() {
	  System.out.println("login with 0 parameters");
  }
	
  public void loginUNAndPwd(String UName, String Pwd) {
	  System.out.println("logoin with userName and Password");
	  
  }
	public void loginOTP(int otp) {
		System.out.println("login with otp");
	}
	
	
	
	
	
	
	
	
	
}
