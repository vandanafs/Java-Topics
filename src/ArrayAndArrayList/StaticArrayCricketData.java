package ArrayAndArrayList;

public class StaticArrayCricketData {

	public static void main(String[] args) {
	
		Object cricketData[]=new Object[6];
		cricketData[0]="kholi";
		cricketData[1]= 32;
		cricketData[2]="RCB";
		cricketData[3]="1.1.1980";
		cricketData[4]="M";
		cricketData[5]=6 ;
		
		for(int i=0; i<cricketData.length;i++) {
			System.out.println(cricketData[i]);
		}
		
		Object player2[]=new Object[6];
		 player2[0]="AB De";
		 player2 [1]= 32;
		 player2[2]="RCB";
		 player2[3]="1.1.1977";
		 player2[4]="M";
		 player2[5]=5.5 ;
		 
		 for(int k=0;k<player2.length;k++) {
			 System.out.println( player2[k]);
		 }
		
		
		
		
		
	}

}
