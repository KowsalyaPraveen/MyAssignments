package week6.day4;

public class LearnEncapsulation {
	public String browser;
	private String browseName;

	public String getBrowseName() {
		return browseName;
	}

	public void setBrowseName(String browseName) {
		this.browseName = browseName;
	}
	
	public static void main(String[] args) {
		LearnEncapsulation le = new LearnEncapsulation();
		le.setBrowseName("Chrome");
		System.out.println(le.getBrowseName());
	}
	
	

}