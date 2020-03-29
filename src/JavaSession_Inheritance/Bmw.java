package JavaSession_Inheritance;
//bmw child of car
public class Bmw extends Car{

	//overrideden method (having same method with same parameter from parent and only changing implements in child class)
	public void start1() {//only implementation changing from inheritance
		System.out.println("Bmw.. start method");
	}
	
	//static methods can not overriden
	public static void test() {
		System.out.println("Bmw...test");
	}
	public void  sunroof() {
		
		System.out.println("sunroof method");
		
			}
	
	
	
}

