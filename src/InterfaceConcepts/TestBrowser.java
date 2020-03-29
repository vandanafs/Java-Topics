package InterfaceConcepts;

public class TestBrowser {

	public static void main(String[] args) {
	  WebDriver driver;
	  String browser="chrome";
	  if (browser.equals("Chrome")) {
		  driver =new ChromeDriver();
		  System.out.println("launch chrome");
	  }
	  else if (browser.equals("Firefox")) {
		  driver=new FireFoxDriver();
		  System.err.println("Launch Firefox");
	  }

	}

}
