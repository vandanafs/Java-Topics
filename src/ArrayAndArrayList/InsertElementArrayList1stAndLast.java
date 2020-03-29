package ArrayAndArrayList;

import java.util.ArrayList;

public class InsertElementArrayList1stAndLast {

	public static void main(String[] args) {
	
		
		ArrayList ar=new ArrayList();
		ar.add("Tom");
		ar.add("John");
		ar.add("Henry");
		System.out.println("Initial size of Array : "+ar.size());
		ar.add(0, "FirstAddedElement");
		System.out.println("After adding 1st Element :"+ar.size());
		ar.add((ar.size()-1), "Last Added Element");
		System.out.println("Final size after adding last element :"+ar.size());
		
		for(int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
	}

}
