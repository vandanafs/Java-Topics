package JavaSessions;

public class DataConvert {

	public static void main(String[] args) {
	
		String x="100";
		System.out.println(x+20);
		
		//120
		int i=Integer.parseInt(x);// string to int
		System.out.println(i+20);
		
		//String to double
		String s2="12.33";
		System.out.println(s2+20);
		
		double d1=Double.parseDouble(s2);
		System.out.println(d1+20);
		///int to String convbersion
		int p=100;
		System.out.println(p+20);
		
		String s1=String.valueOf(p);
		System.out.println(s1+20);
		
		
		boolean b=true;
		System.out.println("hry value  is"+b);
		String s3=String.valueOf(b);//true
		
	}

}
