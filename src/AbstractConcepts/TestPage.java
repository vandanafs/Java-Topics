package AbstractConcepts;

public class TestPage  {

	public static void main(String[] args) {
		//when will constr will be cslled when we create LoginPage object
		
		LoginPage lp=new LoginPage();
		lp.header();
		lp.footer();
		lp.privancyPolicy();
	
	//can not create object of abstract class 	Page p=new Page();

	}

}
