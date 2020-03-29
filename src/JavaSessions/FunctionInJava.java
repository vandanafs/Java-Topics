package JavaSessions;

import java.util.ArrayList;

public class FunctionInJava {

	String name;
	
	public static void main(String[] args) {
		
		//we dont method inside method
		FunctionInJava	obj =new FunctionInJava();
	    obj.name="bandy";
		obj.test();
		
	String studArray[]	=obj.getTopStudent();//array
	for (int i=0; i<studArray.length;i++) {
		System.out.println(studArray[i]);
	}
		obj.add(2, 4);
		
		System.out.println(obj.getTrainerName());
	   System.out.println(obj.getTotalDays());
	   
	 System.out.println( obj.getStudentMarks("Naveen"));
	
   String plugin=obj.launchBrowser("Chrome");
	 System.out.println(plugin);
	 
	 
	ArrayList<String> links = obj.getPageLinksList("HomePage");
	System.out.println(links.size());
	System.out.println(links);
	
	
	}

	//1.simple function:no ipnut and no return
	//void...does not return any value 
	public void test() { // 0 parameter 
		 System.out.println("test method");
	 }
	
	//2.No input but some return
	public String getTrainerName() {
	
	System.out.println("getTrainerName method");
	String name="Naveen";
	return name;
	}
	
	
	public int getTotalDays() {
		System.out.println("getTotalDays methos");
		int days=7;
		return days;
		}
	
	public String[] getTopStudent() {
		System.out.println("getTopStudent method");
	 String student[]=new String[3];// 3 students static array 
	 student[0]="Tom";			
	 student[1]="Mathew";
	 student[2]="smoker";
	 return student;
					 
	}
	
	//3.some input and some return
	public int add(int a, int b) {
		System.out.println("add methosd");
		int sum;
		sum=a+b;
		System.out.println(sum);
		return sum;
		}
	
	
	
	//create a function
	//pass one parameter as String :studentNAme
	//return:marks of the student
	
	
	public int getStudentMarks(String studentName) {
		
	 System.out.println("getStudentMarks for"+studentName);
	
	if(studentName.equals("Neha"))
	{
		return 90;
	}
	else if(studentName.equals("Imad")) {
		return 95;
	}
	else if(studentName.equals("Linda")) {
		return 100;
	}
	
	else {
		System.out.println("student not found");
	}
	
	 return 0;
	}


	//functon :one parameter as browser 
	//logic:launch broweser basis of given browser
	//return plugin
	
	
	public String launchBrowser(String browserName) {
		  String plugin=null;
		if (browserName.equals("Chrome")) {
			System.out.println("launch Chrome");
		    plugin ="Selenium IDE";
		}
		else if(browserName.equals("FF")) {
			System.out.println("launch Ff");
			plugin ="CSS Checker";
		} 
		else if (browserName.equals("safari")) {
			System.out.println("launch safari");
			plugin ="Apple Store";
		}
		
		else {
			System.out.println(browserName+"is not found");
		}
		  return plugin;
	}
	
	
	//function:getPageLinks()
	//parameter:page name(string)
	//return:list of links text
	
	public ArrayList<String> getPageLinksList(String pageName) {
		
		System.out.println("get the page linkLists for : "+pageName);
		
		ArrayList<String> linksList=new ArrayList<String>();
	if (pageName.equals("LoginPage")) {
		linksList.add("Forgot password");
		linksList.add("reset password");
		linksList.add("sign up");
	}
		
	else if (pageName.equals("HomePage")) {
		linksList.add("user profile");
		linksList.add("logout");
		linksList.add("contacts");
	}
		
	
	else if (pageName.equals("ProductPage")) {
		linksList.add("description");
		linksList.add("price");
		linksList.add("seller");
	}
	
	else {
		System.out.println(pageName+"is not found");
	}
	
	 return linksList;
	}
	
	
	
	}	
