package JavaSessions;

public class Employee {

	// data memebers..data types and methods/function
	String name;
	int age;
	int empId;
	String deptName;
	long PhNo;
	boolean isActive;
	
	
	//create method 
	
	
	public static void main(String[] args) {
		
		//create object of the class :new keyword
		Employee e1=new Employee(); //(Employee is class e1 is just name)
	//type of e1 is Employee, e1 name of object,,, object is RHS
		e1.deptName="QA";
		e1.age=30;
		e1.name="vandana";
		e1.empId=123;
		e1.PhNo=761903736;
		e1.isActive=true;
		
		System.out.println(e1.name+ "  "  +e1.deptName+" "+e1.empId+" "+e1.age+" "+e1.isActive);
		
		Employee e2=new Employee();
		e2.name="Aditi";
		e2.deptName="baby";
		e2.empId=23122;
		e2.age=1;
		e2.PhNo=98766222;
		System.out.println(e2.name+"   "+e2.deptName);
		
		Employee e3=new Employee();
		e3.name="Saif";
		e3.age=43;
		e3.empId=98;
		e3.isActive=true;
		System.out.println(e3.name+ "  "  +e3.deptName+" "+e3.empId+" "+e3.age+" "+e3.PhNo+" "+e3.isActive);
		
		Employee e4=new Employee();
		e4.name="Aadhya";
		System.out.println(e4.name+ "  "  +e4.deptName+" "+e4.empId+" "+e4.age+" "+e4.PhNo+" "+e4.isActive);
		
		
		//not good practice(below one)
		//Risk1:will be deleted by garbage collector
		
		//new Employee().name="Avni";//new object without ref name
		
		
	}

}
