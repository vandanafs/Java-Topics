package JavaSessions;

public class NullReferrence {
 String name;
  int age;


 public NullReferrence(String name, int age) {
	this.name = name;	
	this.age = age;
}


    public static void main(String[] args) {
//	 NullReferrence nr=new  NullReferrence("NEha",30);
//	 System.out.println(nr.name +"  "+nr.age);
//	 nr=null;
//	 System.out.println(nr.name);
//	}

	//OR below method 
    	NullReferrence obj=null;
    	System.out.println(obj.name);
    
    }
}
