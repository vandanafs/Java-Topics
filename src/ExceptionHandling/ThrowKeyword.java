package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		 //throws ...escapee from exception handling
		//throw, deliberately i want to throw exception'
		try {
		throw new Exception("NoDataFoundException");
		}
		catch(Exception e) {
			System.out.println("No data Found");
			e.printStackTrace();
		}
		
		String data="";
		if(data.equals("")) {
			System.out.println("data is not available");
		
			try {
		    throw new Exception("DataNotAvailable");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	}
}
