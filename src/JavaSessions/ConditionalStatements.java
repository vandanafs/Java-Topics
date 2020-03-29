package JavaSessions;

public class ConditionalStatements {

	public static void main(String[] args) {
		
	int a=50;
	int b=70;
	
	if(a>b) {
		System.out.println("a is greater");
	}
	else {
		System.out.println("b is greater");
	}
		
		if(true) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
			
		}
		
		if(b>=a) {
			System.out.println("b>=a");
		}
			
		//> > >= <= == !=
		
		if(a!=b) {
			System.out.println("not equal");
			
		}
		
		 if(!false){
			 System.out.println("true");
		 }
		
		 
		 String s1="Selenium";
		 String s2="Selenium";
		 
		 if (!s1.equals(s2)) {
			 System.out.println("not equal");
		 }
		 else {
			 System.out.println("equal");
		 }
		 
		 
		int total=100;
		int finalAmt =0;
		if(total<=100) {
			finalAmt=total+10;
			
		}
		 
		if(total>100&& total<=200) {
		 finalAmt=total+20;
		}
		System.out.println("final Bill =" +finalAmt); 
		 
		 
	//IF-ElseIF	 
	//WAP to find out the greatest no
		int x=500;
		int y=400;
		int z=700;
		
		if(x>y && x>z) {
			System.out.println("x is greatest");
		}
		else if (y>z)
		{
			System.out.println("y is greatesr");
		}
		else
		{
			System.out.println("z is greatest");
		}
		
		//IF Inside If
		String studentName="Aadhay";
		int marks=0;
		int engMarks=0;
		
		if(studentName.equals("Vandana")) {
			marks=90;
			engMarks=100;
			System.out.println("MArks for"+ studentName +"is"+marks);
			  if(engMarks>=90&& marks>=50) {
				  System.out.println("Eng Score card is"+engMarks);
				  System.out.println(studentName + " awarded for scholarship...."); 
			  }
			
			    else if  (studentName.equals("Aadhay")) {
				   marks=20;
				   System.out.println("MArks for"+ studentName +"is"+marks);
			    
			    }
			    else if (studentName.equals("Hiya")){
			    	marks=1;
			    	engMarks=20;
			    	System.out.println("marks for"+studentName+" is "+marks);
			    }
			    else if (studentName.equals("Aditi")){
			    		marks=1;
			    		engMarks=99;
			    		System.out.println("marks for"+studentName+" is "+marks);
			    		 System.out.println(studentName + " awarded for  scholarship...");
			
		}
			
		}
		else {
			System.out.println("studenr"+studentName+"not found");
			
		}
		
		
		
		
	}

}
