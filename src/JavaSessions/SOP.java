package JavaSessions;

import java.io.PrintStream;

public class SOP {
    int age=30;
	static PrintStream out1;
	
	public static void main(String[] args) {
		
		System.out.println(1);
	//	System.out.println(true);
		System.out.println("test");
		//println().. is overloaded method in PrintStream class
		//out.. is static field inside System Class with PrintStream class refernce
		//type of out PrintStream
		//System....is default classss
		
		 PrintStream a = SOP.out1;
  SOP.out1.println();
	}

}
