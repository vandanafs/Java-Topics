package AccessModifier;

public class Car {

	public String color="red";
	private int price=20;
	
	String name="honda";
	protected String type="sedan";
	
	public void getName() {
		
	}
	
	private void getClassName() {
		
	}
	
	void getEngine() {
		
	}
	
	protected void getDriver() {
		
	}
	
	
public static void main(String[] args) {
	
		
		Car c=new Car();
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.name);
		System.out.println(c.type);
}
	
}
