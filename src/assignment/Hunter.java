package assignment;

public class Hunter {
	private String name;
	private String color;
	private int xPOS;
	private int yPOS;
	
	//parameterized constructor
	public Hunter(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getxPOS() {
		return xPOS;
	}
	
	public int getyPOS() {
		return yPOS;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setxPOS(int xPOS) {
		this.xPOS = xPOS;
		try {
			if(xPOS>=250) {
				throw new SoundException("Öh oo!!");//display message
			}
		}catch(SoundException e) {
			System.out.println(e);
		}
	}
	
	public void setyPOS(int yPOS) {
		this.yPOS = yPOS;
		try {
			if(yPOS>=300) {
				throw new SoundException("Öh oo!!");//display message
			}
		}catch(SoundException e) {
			System.out.println(e);
		}
	}
	
	public void move(Hunter myhunetr) {
		System.out.println("Hunter is moving. X : " + this.xPOS + "Y : " + this.yPOS);//display
	}
	
	public void hunt(Board myboard) {
		
	}
	
}
	

