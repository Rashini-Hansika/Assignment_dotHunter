package assignment;

class Board{
	private String type;
	private String myHunetr;
	private String threeSoldiers[];
	private int numOfDots = 97;
	private int superDots = 3;
	
	//parameterized constructor
	public Board(String type, String myHunetr, String[] threeSoldiers) {
		this.type = type;
		this.myHunetr = myHunetr;
		this.threeSoldiers = threeSoldiers;
	}
	
	public void move(String myhunetr) {
		
	}
	
	public void hunt(Board myboard) {
		
	}
	
	//getters
	public String getType() {
		return type;
	}

	public int getSuperDots() {
		return superDots;
	}

	public int getNumOfDots() {
		return numOfDots;
	}

	public String getMyHunetr() {
		return myHunetr;
	}

	public String[] getThreeSoldiers() {
		return threeSoldiers;
	}

	//setters
	public void setType(String type) {
		this.type = type;
	}

	public void setSuperDots(int superDots) {
		this.superDots = superDots;
	}

	public void setNumOfDots(int numOfDots) {
		this.numOfDots = numOfDots;
	}

	public void setMyHunetr(String myHunetr) {
		this.myHunetr = myHunetr;
	}
	public void setThreeSoldiers(String[] threeSoldiers) {
		this.threeSoldiers = threeSoldiers;
	}

	
}
