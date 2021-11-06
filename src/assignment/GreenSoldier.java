package assignment;

public class GreenSoldier extends Soldier{
	public String uniqueWay = "knife";
	
	//default constructor
	public GreenSoldier() {} 
	
	//parameterized constructor
	public GreenSoldier(String uniqueWay) {
		super();
		this.uniqueWay = uniqueWay;
	}

	//display
	public void hunt() {
		System.out.println("Killed using a " + this.uniqueWay + "\nGame Over");
	}
}
