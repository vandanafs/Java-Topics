package JavaSessions;

import java.util.ArrayList;

public class Page {

	String Title;
	String url;
	int loadingTime;
static ArrayList<String> browsers;
	
	public static void main(String[] args) {
	 
		Page loginPage=new Page();
		 loginPage.Title="Google Login";
		 loginPage.url="http://www.google.com";
		 loginPage.loadingTime=5;
		System.out.println(loginPage.browsers);
		 
		 browsers=new ArrayList<String>();
		 browsers.add("Chrome");
		 browsers.add("safari");
		 
		 
		 
		 Page homePage=new Page();
		 homePage.Title="Gmail Login";
		 homePage.url="http://www.gmail.com";
		 homePage.loadingTime=4;
		
		
		System.out.println(loginPage.Title + "  \n"+homePage.Title);
	
	
	
	
	
	}

}
