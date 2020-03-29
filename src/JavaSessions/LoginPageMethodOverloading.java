package JavaSessions;

public class LoginPageMethodOverloading {

	public static void main(String[] args) {
		
	}

	public void login() {
		System.out.println("0 parameters");
	}
	
	public void login(String UName,String Pwd) {
		System.out.println("2 parameters login");
	}
	
	public void login(int otp) {
		System.out.println("login with OTP");
	}
}
