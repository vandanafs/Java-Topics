package InterfaceConcepts;

public class TestDriver extends ChromeDriver implements WebDriver {

	public static void main(String[] args) {
		
		ChromeDriver cd=new ChromeDriver();
		//WebDriver Interface
		cd.launchBrowser();
		cd.getTitle();
		cd.click();
       cd.closeBrowser();
      //Protractor Interface
       cd.launchUrl();
       cd.maxmie();
       
       //chromeDriver Spl methods
       cd.headless();
       cd.incongitoMode();
       
       //ChromeDriver extends WebBrowser(parent class)
       cd.getCookies();
       cd.getHeader();
       
       System.out.println(WebDriver.time_out);
       cd.run();
       WebDriver.visual();
       
      //can not create object of interface
     // WebDriver wd=new  WebDriver(); not possible to create object of IF
       //up or Top casting with parent interface /Class allowed 
       WebDriver driver =new ChromeDriver(); //new ChromeDriver can access only WebDriver methods 
       driver.launchBrowser();
       driver.click();
       driver.getTitle();
       driver.closeBrowser();
       
       WebBrowser wb=new ChromeDriver();// new ChromeDriver is of type parent WebBrowser class
    
       
       
    
	}

}
