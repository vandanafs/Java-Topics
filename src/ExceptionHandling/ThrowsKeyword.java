package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) throws Exception {
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.launchBrowser() ;

	} 
	
	public void launchBrowser() throws Exception {
		System.out.println("launchBrowser");
		checkBrowserVesrion();
	}
	
	 public void checkBrowserVesrion() throws Exception  {
		 System.out.println("checkBrowserVesrion");
		 checkOS();
	 }
	 
	 public void checkOS() throws Exception {
		 System.out.println("check OS");
		 int i=9/0;
	 }
}
