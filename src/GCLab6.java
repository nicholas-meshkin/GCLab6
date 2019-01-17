import java.util.Random;
import java.util.Scanner;

public class GCLab6 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Hello! Welcome to 'Roll-them-Bones'! Please chose the number of sides on the dice.");
		int sides = scnr.nextInt();
		String userChoice = "y";
		int rollCount = 0;
		int roll1;
		int roll2;

		do {
			rollCount+=1;
			System.out.println("Roll " + rollCount + ":");
			roll1 = generateRandomDieRoll(sides);
			roll2 = generateRandomDieRoll(sides);
//			int rollx = mathRandomDieRoll(sides); Math.random test
			int total = roll1+roll2;
			System.out.println(roll1);
			System.out.println(roll2);
//			System.out.println(rollx); Math.random test
			System.out.println("Total is " + total);
			if(total == 12 && sides == 6) {
				System.out.println("Boxcars!");
			}
			if(total == 2 && sides == 6) {
				System.out.println("Snake-eyes!");
			}
			System.out.println("Roll again? (y/n)");
			userChoice = scnr.next();

		}while(userChoice.startsWith("y"));
		System.out.println("Goodbye!");
		scnr.close();
	}

	public static int generateRandomDieRoll(int sides) {
		Random rand = new Random();
		int roll = rand.nextInt(sides) + 1;
		return roll;
	}
//	Math.random test section
//	public static int mathRandomDieRoll(int sides) {
//		int rand = (int)(Math.random()*sides) +1;
//		return rand;
//	}
	
}
