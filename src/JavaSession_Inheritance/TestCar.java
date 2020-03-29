package JavaSession_Inheritance;

public class TestCar {
	
 final int days=7;

 
	public static void main(String[] args) {
	
		Bmw b=new Bmw();
		b.start();//prefernce given object;8
		b.stop();
        b.airPressure();
        b.test();
       Car.test();
        b.sunroof();
        b.engine();
        System.out.println("............");
        
        Car c=new Car() ;
        	c.start();
       c.airPressure();
        
       System.out.println(".........");
        //up castimg /top ...
       //child class object can be reffered by parent class ref variable 
        Car c1=new Bmw();//child method implemenets  are taken priority its new BMW
         c1.start();//bmw 
        c1.stop();
        c1.airPressure();
        
        Vehicle v=new Bmw();//multi level inherincatnce
        
        
        
        c1.engine();
        //c1.sunroof can not accssed bcos refernce check fails
       
        //downcasting ( type mismatch Bmw b1= new Car();  )
       
       // Bmw b1=(Bmw) new Car();//ClassCastException example maruti car put bmw logo AND SELL TO CUST, WHEN cust runs `
        
        
        
	}

}
