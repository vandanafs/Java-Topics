package JavaSessions;

public class ArrayConcepts {
	//arrays are colection of similar types of data 
	//Two major limitation of static arrays
	//1.size is fixed:static array->to over come this prob use dynamic(Array
	//2.similar type of data t overcome this prob ujse dynamic array (ArryaList
	public static void main(String[] args) {
		
		//1.int Array
		int i[]=new int[5];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[4]=50;
		
		System.out.println(i[0]);
	//	System.out.println(i[6]);//ArrayIndexOutOfBoundsException 
		int len=i.length;//just length bcos of array if its interger then length()
		System.out.println("length of array is: "+len);
		System.out.println("Li is :"+0);
		System.out.println("Hi is  :"+(len-1));
		
		//to print all values from array
		for(int j=0; j<i.length;j++) {
			System.out.println(i[j]);
			
			if(i[j]==30) {
				System.out.println("hello world");
			}
			
			if(j==4) {
				System.out.println("bye!!!!1");
			}
		}
		

		 for(int j=0;j<i.length;j++) {
			 System.out.println(j+ "-->"+i[j]);
			 
			 
			 ///double array
			 double d[]=new double[2];
			 d[0]=10.23;
			 d[1]=14.77;
			 System.out.println(d[0]+d[1]);
			 
			 //String arrays
			 String studentName[]=new String[4];
			 studentName[0]="Aditi";
			 studentName[1]="Aadhya";
			 studentName[2]="Hiya";
			 studentName[3]="vandan";
			 
			// System.out.println(studentName[1]);
			 //print all students name
			 for (int count=0;count<studentName.length;count++) {
				System.out.println(studentName[count]); 
				
				String name=studentName[count];
				if(name.equals("Aadhya")) {
					System.out.println("Topper");
				}
			 }
			
			 
			 //object Array 
			 Object empData[]=new Object[5];
			 empData[0]="vandana";
			 empData[1]='F';
			 empData[2]=32;
			 empData[3]=true;
			 empData[4]=12.66;
			 
			 for(int p=0;p<empData.length;p++) {
				 System.out.println(empData[p]);
			 }
		 }
	}

}
