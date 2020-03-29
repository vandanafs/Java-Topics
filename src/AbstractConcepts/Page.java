package AbstractConcepts;
//abstract class 
public abstract class Page {
    //can i create abstract class constr,yes can be created 
	//when child class object creted, both parent and child class constr will be called
	public Page() {
		System.out.println("page ...constr");
	}
	
	
	
	//can i create abstact class without any abstart method?,yes its possible
	public abstract void header();//abstract class and interface have method declaration
	public abstract void header(int a);
	public abstract void footer();
	
	
	//No Abstract method...0 abstarction
	//smoe abstarct and non abstarct methos,,, partial abstarction'
	//only abtract methods is called 100% abstarctio
	
	
	//0 to 100 abstarction
	//interfaces are 100 % abstartion 
	public void privancyPolicy() {//non abstract method common for all pages 
		 System.out.println("Page...privancy");
	}
	
	public void logo() {
		System.out.println("page...logo");
	}
	
}
