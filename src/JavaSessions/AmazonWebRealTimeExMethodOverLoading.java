package JavaSessions;

public class AmazonWebRealTimeExMethodOverLoading {

	public static void main(String[] args) {
		
		 AmazonWebRealTimeExMethodOverLoading aw=new  AmazonWebRealTimeExMethodOverLoading();
		 aw.search("shoes", "black", 5000); 
	}
 
	public void search() {
		System.out.println("without criteria");
	}
	
	public void search(String name) {
		System.out.println("procuct name");
	}
	
	
	public void search(String name,String color) {
		System.out.println("procuct name and color");
	}
	
	public void search(String name,String color, int price) {
		System.out.println("procuct name and color and proice,");
	}
	
	
	
}
