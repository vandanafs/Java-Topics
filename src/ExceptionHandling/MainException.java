package ExceptionHandling;

public class MainException {

	public static void main(String[] args) {
	  
//	int m1	=getMarks("aditi");
//		System.out.println(m1);
//		
		
		int p1=makeConnectoion();
		 System.out.println(p1);// catch block return override by finally block return 
		
		
		
	}

	  public  static int getMarks(String studentName) {
		 
		  if (studentName.equals("aditi")) {
		 
		   try {
			   int i=9/0;
		   }catch(Exception e) {
			   return -1;
		   }
		  }
		 
		  else if (studentName.equals("aadhu")) {
			    return 100;
			  }
		  
		  else if (studentName.equals("Ashi")) {
			   return 80;
			  }
		  
		  else {
			  return -1;
		  }
		  return -1;
	  }
	  
	  
	  public static  int  makeConnectoion() {
		  System.out.println("make connection with DB");
		  
		  try {
			  int i=9/0;
		  }catch(Exception e) {
			  return -1;
		  }
		  
		  finally {
			  return -2;
		  }
	  }
}
