package ExceptionHandling;

public class TryWithoutCatch {

	public static void main(String[] args) {
		
		System.out.println("ABC");
		
		try {
			System.out.println("DB connection start");
			int i=9/0;
			System.out.println("ABC");
		}
		catch(Exception e) {
			System.out.println("Hey i have handled it");
		}
		
		finally {//it always be executed irrespective of anythg
			System.out.println("Disconnect");
		}
		
		System.out.println("bye");
	}

}
