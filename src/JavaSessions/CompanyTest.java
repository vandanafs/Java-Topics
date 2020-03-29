package JavaSessions;

public class CompanyTest {

	public static void main(String[] args) {
		
		CompanyGetterAndSetter c1=new CompanyGetterAndSetter();
		c1.setName("Microsoft");
		System.out.println(c1.getName());
		
		
		c1.setTotalEmp(20982);
		System.out.println(c1.getTotalEmp());
		
		c1.setPolicy("Financial value");
		String p1=c1.getPolicy();
		System.out.println(p1);
		
		
		
		
		
	}

}
