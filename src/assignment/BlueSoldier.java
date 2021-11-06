package assignment;

public class BlueSoldier extends Soldier{
	public String uniqueWay = "gun";
	
	//default constructor
	public BlueSoldier() {} 
	
	//parameterized constructor
	public BlueSoldier(String uniqueWay) {
		super();
		this.uniqueWay = uniqueWay;
	}
	
	//display
	public void hunt() {
		System.out.println("Killed using a " + this.uniqueWay + "\nGame Over");
	}
	
}
