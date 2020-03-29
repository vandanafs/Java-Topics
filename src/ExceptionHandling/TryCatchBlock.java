package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args)  {
		//Throwable-super class of all Exceptions
		//Exception is super class of all Exception ex nullpointer, Airthmetic 
		//Error-compile time,syantax error errors
		System.out.println("A");
        System.out.println("A");		
		
        try {
        int i=9/0;//airthmeticException
        int a[]=new int[2];
        a[3]=21;
        
        }
       // catch(Exception e)
        catch(ArithmeticException e){
        	System.out.println("Some Exception got occurred"+e.getMessage());
         // e.printStackTrace();//trace the exception where exactly iyt occurred
         
         }
        
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Array Index excption got occurred "+e.getMessage());
        }
        
        try {
        Thread.sleep(5000);//5sec
        }catch(InterruptedException e) {
        	
        }
        
        System.out.println("A");
	}

}
