package assignment;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hunter myhunetr = new Hunter("Maha Deva","Brown");
		Soldier threeSoldiers[] = {new RedSoldier(),new BlueSoldier(),new GreenSoldier()};
		Board myboard = new Board("superDot",myhunetr,threeSoldiers);
		
		System.out.println("Use the keyboard up, down, left, right arrow keys to move the hunter");
		myhunetr.setxPOS(sc.nextInt());
		myhunetr.setyPOS(sc.nextInt());
		myhunetr.move(myhunetr);
		myhunetr.hunt(myboard);
		threeSoldiers[2].hunt();
	}

}
