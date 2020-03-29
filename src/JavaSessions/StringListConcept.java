package JavaSessions;

import java.util.ArrayList;

public class StringListConcept {

	public static void main(String[] args) {
	   //default class available in java= ArrayList (never create in this name)
		//default capacity ie VC =10
		
		ArrayList ar=new ArrayList(); // defaukt size of arrayList =10 virtual capacity
		
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		System.out.println(ar.size());//2
		
		ar.add(300);
		ar.add(400);//4
		
		System.out.println(ar.size());//4
		ar.add(500);
		ar.add(600);
		System.out.println(ar.size());//6
		
		System.out.println(ar.get(2));//300
		ar.add("Aditi");
		ar.add(9999);
		ar.add('m');
		ar.add(true);
		//System.out.println(ar.get(6));//arrayoutofBound
		
		ar.remove(4);//5
		System.out.println(ar.size());//5
	    
		System.out.println(ar.get(4));
		
		System.out.println(".........");
		//Amazon website ArrayList bcos daily links gets changes
		
		//to print all values from for loop
		 for(int i=0;i<ar.size();i++) {
			 System.out.println(ar.get(i));
		 }
		  
		 System.out.println("............");
		
		//Generics
		 ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(233);
		 
		 ArrayList<Double> salary=new ArrayList<Double>();
		  salary.add(12.22);
		  salary.add(100.0);
		  
		  ArrayList<String> studName=new ArrayList<String>();
          studName.add("Aadhya");
          
          
          ArrayList<Object> data=new ArrayList<Object>();
	   data.add("Vandana");
	   data.add("88888");
	   data.add("12.12.1909");
	   data.add('m');
	   data.add(true);
	   for(int j=0; j<data.size(); j++){
		   System.out.println(data.get(j));
	   }
	   
	   
	   
	   
	}

}
