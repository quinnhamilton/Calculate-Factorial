import java.util.Scanner;

/**
 * 
 */

/**
 * @author Harley Quinn 
 * Purpose: Calculate the factorial of a number.
 *
 */
public class CalculateFactorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int userInput = 1;
		String contin = "y";

		while (contin.matches("^[yY]$")) { //while the user would like to continue, the following will run

			System.out.println("Welcome to the Factorial Calculator!");
			System.out.println("");
			System.out.print("Enter an integer between 1 and 10: ");
			userInput = scanner.nextInt();
			
				while (userInput < 1 || userInput > 10) { //checks the user's input to make sure it's between 1 and 10
					System.out.println();
					System.out.println("That is not a valid option. Please enter an integer between 1 and 10.");
					System.out.println();
					System.out.print("Enter an integer between 1 and 10: ");
					userInput = scanner.nextInt();
				} 
				System.out.println();
				System.out.println("Thanks! " + "Your factorial result is: " + fact(userInput)); //see line 47 for the factorial calculation method
				System.out.println();
				System.out.print("Continue? (y/n): "); //asks if the user would like to continue
				contin = scanner.next();
		}
		System.out.println("Goodbye!");
		scanner.close();
	}

	public static long fact(long i) {

		if (i == 0)
			return 0;
		if (i > 1) {
			i = i * fact(--i);
		}
		return i;

	}
}
