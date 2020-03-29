
public class Company {
 //variable are encapsulated within methods
	//hide the implementations from user
	
	String name;
	int totalEmp;
	String ceoName;
	String policy;
	
	//1.create object of class and asccess the class variables and assign values
	//2.create constr and assign 
	public Company(String name, int totalEmp, String ceoName, String policy) {
		super();
		this.name = name;
		this.totalEmp = totalEmp;
		this.ceoName = ceoName;
		this.policy = policy;
	}

	
	public static void main(String[] args) {
	//1. method
//		Company obj=new company();
//				obj.ceoName="IBM";

	Company obj=new Company("Google",1222,"Sundar","Finacial policy");
	
	System.out.println(obj.name+"  "+obj.ceoName);
	
	
	
	
	
	}

	
}
