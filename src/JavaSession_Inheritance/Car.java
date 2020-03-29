package JavaSession_Inheritance;
//parent of Bmw and Audi
public class Car extends Vehicle {
    
	
	public static void test() {
		System.out.println("Car..test static");
	}
	public final void start() {
		System.out.println("car... start method");
	}
	public void stop() {
		System.out.println("car... stop method ");
	}
	
	public void airPressure() {
		System.out.println("Car.. air pressure check");
	}
}
