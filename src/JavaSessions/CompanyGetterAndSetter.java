package JavaSessions;

public class CompanyGetterAndSetter {
 //variable are encapsulated within methods
	//hide the implementations from user
	
	String name;
	int totalEmp;
	String ceoName;
	private String policy;
	
	//1.create object of class and asccess the class variables and assign values
	//2.create constr and assign 
	
	public CompanyGetterAndSetter() {
		super();
		this.name = name;
		this.totalEmp = totalEmp;
		this.ceoName = ceoName;
		this.policy = policy;
	}
	//3.creating getter and setter :each class variable
	//3.method getter setter(right click->source-> generate getter and setter
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getTotalEmp() {
		return totalEmp;
	}



	public void setTotalEmp(int totalEmp) {
		this.totalEmp = totalEmp;
	}



	public String getCeoName() {
		return ceoName;
	}



	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}



	public String getPolicy() {
		return policy;
	}



	public void setPolicy(String policy) {
		this.policy = policy;
	}
		
		public static void main(String[] args) {
	//1. method
//		Company obj=new company();
//				obj.ceoName="IBM";

//	Company obj=new Company("Google",1222,"Sundar","Finacial policy");
//	
//	System.out.println(obj.name+"  "+obj.ceoName);
//	
//	
//	
	
	
	}



		

	
}
