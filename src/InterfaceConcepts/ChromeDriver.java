package InterfaceConcepts;

public class ChromeDriver extends WebBrowser implements WebDriver,Protractor {

	
	//WebDriver
	@Override
	public void launchBrowser() {
		System.out.println("ChromeDriver ......launchBrowser");
		
	}

	@Override
	public void click() {
		System.out.println("ChromeDriver ......clcik");
	}

	@Override
	public void getTitle() {
		System.out.println("ChromeDriver ......getTtile");
	}

	@Override
	public void closeBrowser() {
		System.out.println("ChromeDriver .....closeBrowser");
		
	}

	@Override
	public void launchUrl() {
		System.out.println("ChromeDriver ......launchUrl");
	}

	@Override
	public void maxmie() {
		System.out.println("ChromeDriver ......maximize");
		
	}

	//ChromeDriver
	public void headless() {
		System.out.println("support headless");
	}
	
	public void incongitoMode() {
		System.out.println("support  incongitoMode");
	}
	
	
	
	
	
}
