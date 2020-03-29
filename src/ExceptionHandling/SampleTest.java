package ExceptionHandling;

public class SampleTest {

	public static void main(String[] args) {
	
		System.out.println("ABC");
		try {
			int i=9/0;
			System.out.println("ABC");
		}
		catch(Exception e) {
			System.out.println("Bhye..");
		}
	}

}
