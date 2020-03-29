package SuperConcept;

public class LoginPage extends Page {
String title;
 public LoginPage() {
	 System.out.println("lp..default cont");
 }
	
	public LoginPage(String title) {
		//super :parent class obj referemnce
		//super();//call parent class default const
		super(title);//call parameterised parent const
	   super.getName();//super keyword used to call parent class methods also
		System.out.println("child title :"+title);
		this.title=title;
	}
	
	
	public void getClassName() {
		super.getName();
		System.out.println("page class");
	}
}
