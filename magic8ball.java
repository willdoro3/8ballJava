// Magic 8 Ball Java
package magic8ball;

// Import the Scanner and the Random
import java.util.Scanner;
import java.util.Random;

public class Magic8Ball {

	public static void main(String[] args) {
		
		// Declare a new Scanner and a new Random
		Scanner ball = new Scanner(System.in);
		Random rng = new Random();
		
		// Properties 
		String question;
		char y_or_n;
		String[] answers = new String[]{"Yes", "No", "Maybe", "Most Likely", "Unlikely", "Probably", "Possibly", "Doesn't look good", "I don't know", "The stakes are high", "It's not looking too good"};
		// the code below is what gives us a random index of array answers
		int index = rng.nextInt(answers.length);
		
		
		System.out.print("Would you like to ask the Magic 8 Ball a Question? (Y or N): ");
		y_or_n = ball.next().charAt(0);
		
		// If the user fails to enter the correct input for y_or_n, it will repeaditely ask the question 
		while (y_or_n != 'Y' && y_or_n != 'y' && y_or_n != 'N' && y_or_n != 'n') {
			System.out.println("\nInvalid input!!");
			System.out.print("Would you like to ask the Magic 8 Ball a Question? (Y or N): ");
			y_or_n = ball.next().charAt(0);
		} // End of while loop
		
		// This while loop loops through the program as long as the conditions of y_or_n are met
		while (true){
			
			if (y_or_n == 'Y' || y_or_n == 'y'){
				
				System.out.print("\nAsk the Magic 8 Ball a Yes-or-No Question: ");
				question = ball.next();
		
				System.out.println("\nThe Magic 8 Ball's Answer:");
				// Prints out an index from array answers
				System.out.println(answers[index]);
				
				System.out.print("\nWould you like to ask another question? (Y or N): ");
				y_or_n = ball.next().charAt(0);
				
				// If the user fails to enter the correct input for y_or_n, it will repeaditely ask the question
				while (y_or_n != 'Y' && y_or_n != 'y' && y_or_n != 'N' && y_or_n != 'n') {
					System.out.println("\nInvalid input!!");
					System.out.print("Would you like to ask another question? (Y or N): ");
					y_or_n = ball.next().charAt(0);
				} // end of while loop
				
				// If the condition is met, the program will end
				if (y_or_n == 'N' || y_or_n == 'n'){
					System.out.println("\nYou have exit the program.");
					break;
				} // end of second if statement
			
			
		} // end of first if statement 
			
			// If the condition is met, the program will end
			else if (y_or_n == 'N' || y_or_n == 'n'){
				System.out.println("\nYou have exit the program.");
				break;
			} // end of else if statement
			
		
	} // end of while loop
	
} // end of main
} // end of class 
