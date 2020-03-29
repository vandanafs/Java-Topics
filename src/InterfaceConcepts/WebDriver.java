package InterfaceConcepts;

public interface WebDriver {
     
	int time_out=20;//(by defalut static and final in nature)
	
	public void launchBrowser();
	public void click();
    public void getTitle();
	public void closeBrowser();
	//can not create  object of interface
	//can not overide static methods ,hence static methods are allowed to write on interface
	//final methods are not override hence in not allowed in  interface
	//only method declratiom , only method prototype 
	//no method body
	//no static and final prototype methods in interface 
	//interface variables are static and final by default 
	
	//after jdk 1.8
	//1.we can have default method wiht method body 
	
	default void run() {
		System.out.println("webdriver run");
	}
	//2.static method with method body in interface 
	public static void visual() {
		System.out.println("webdriver....visual");
	}
}
