package JavaSessions;

public class StaticAndNonStaticConcepts {
   
	String name ="Tom";
   static  int age=30;
	
	public static void main(String[] args) {
	
    
    
    StaticAndNonStaticConcepts obj=new StaticAndNonStaticConcepts();
    System.out.println(obj.name);
  
    System.out.println(obj.age);
	obj.getDiscount();
	obj.getPrice();
	
	}
	
    public void getDiscount() {
    	System.out.println("Discount methd");
    }
    
    public static void getPrice() {
    	System.out.println("price method");
    }
	

}
