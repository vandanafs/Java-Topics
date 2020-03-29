package AbstractConcepts;

public class LoginPage extends Page {
    
	public LoginPage() {
		System.out.println("LogibPage...constr");
	}
	
	@Override
	public void header() {
         System.out.println("Lp --header");
		
	}

	@Override
	public void footer() {
		 System.out.println("Lp --footer");
		
	}

	@Override
	public void header(int a) {
		// TODO Auto-generated method stub
		
	}

}
