import java.util.Scanner;

/*
 * Write a program that will recognize invalid inputs when the user requests information
 * about students in a class.
 * @author Julia Dart
 * @version 1.0
 */
public class JavaStudentsLab8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = { "John", "Jacob", "Camila", "Michelle", "Brandon", "Alex", "Janiece", "Matthew", "Tiffany",
				"Joseph", "Cheo", "Kaelan", "Julia" };
		String[] hometown = { "Honolulu", "Atlanta", "San Francisco", "Hong Kong", "Detroit",
				"Charlotte", "Detroit", "Grand Rapids", "Austin", "Boston", "London", "Toronto", "Elk Rapids" };
		String[] animals = { "Dogs", "Giraffes", "Mice", "Wolves", "Whales", "Tigers", "Eagles", "Bees", "Dolphins",
				"Monkeys", "Eels", "Sharks", "Cats" };
		System.out.println("Welcome to the Java classroom!");
		int userNum = 0;
		String userInput = "";
		
		String cont = "y";
		String cont2 = "y";

		// validate name for range and int type
		while (cont2.equals("y")) {
		userNum = Validator.getInt(scan, "Which student would you "
				+ "like to know more about (type a number from 1-13): ", 1, 13);
			System.out.println("Student " + userNum + " is " + names[userNum - 1]);
			System.out.println();
			cont = "y";
			while (cont.equals("y")) {
				// print out student for that index and prompt for next input
				System.out.println("What would you like to know about " + names[userNum - 1] + "?");
				System.out.println();
				
				userInput = Validator.getString(scan, "Please enter \"hometown\" or \"animal\" for favorite animal. ");
				System.out.println();
				// scan.nextLine();

				//Print associated info based on 
				if (userInput.equalsIgnoreCase("hometown")) {
					System.out.println(names[userNum - 1] + " is from " + hometown[userNum - 1]);
				} else if (userInput.equalsIgnoreCase("animal")) {
					System.out.println(names[userNum - 1] + "'s favorite animal is " + animals[userNum - 1]);

				} else {
					System.out.println("Please enter valid entry next time!");
					System.out.println();
				}

				cont = Validator.getString(scan, "Would you like to know more? (y/n) ");
				System.out.println();
			}
			cont2 = Validator.getString(scan, "Would you like to know about another student? (y/n) ");
			System.out.println();
		}

				
		System.out.println("Have a nice day!");


	}

}
