package assignment;

public class RedSoldier extends Soldier{
	public String uniqueWay = "hand";
	
	//default constructor
	public RedSoldier() {} 
	
	//parameterized constructor
	public RedSoldier(String uniqueWay) {
		super();
		this.uniqueWay = uniqueWay;
	}

	//display
	public void hunt() {
		System.out.println("Killed using a " + this.uniqueWay + "\nGame Over");
	}
	
}