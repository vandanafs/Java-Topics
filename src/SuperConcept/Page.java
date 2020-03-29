package SuperConcept;

public class Page {

	String header;
	public Page() {
		System.out.println("page....default const");
	}
	
	public Page(String header) {
		System.out.println("parent tilte:"+header);
		this.header=header;
	}
	
	
	public void getName() {
		System.out.println("page Name");
		
	}
}
