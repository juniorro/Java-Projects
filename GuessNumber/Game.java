/**
* The Game program implements an application that
* simply asks a user to guessed a random number generated
* by the computer. It will run until the
* user guesses the correct number.
*
* @author  Roland Junior Toussaint
* @version 1.0
* @since   12/03/2016
*/

package game;

//import utility for scanner
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		//create a new scanner object
		Scanner input = new Scanner(System.in);
		
		//variable to run & stop game
		boolean isRunning = true;
		
		//did the user guess?
		boolean guessednumber = true;
		
		//hold random value
		int number = 0;
		
		//hold user input
		int userinput = 0;
		
		//run game
		while (isRunning){
			
			if (guessednumber){
				
				System.out.println("This computer guessed a random number from 1 to 10");
				System.out.println("Take a guess at it...");
				System.out.println("-1 to exit");
				number = randomNumber(9);
				guessednumber = false;
				
				
			}//end if
			
			else {
				
				System.out.println("Oppsies!! Wrong!! Please try again...\n");
			}//end else
			
			userinput = input.nextInt();
			
			if (userinput == - 1){
				
				//end game
				isRunning = false;				
			}//end if 
			
			 //if guess if correct
			else if (userinput == number){
				
				System.out.println("Congratulations!! Your guess " +userinput+ " is correct");
				System.out.println("The computer actually guessed " +userinput+".");
				isRunning = false;
			}//end if
			
			else {
				
				//set guess to true or false
				guessednumber = userinput == number;
				
			}// end else
			
			
		}//end while loop

	}// end main class

	
	public static int randomNumber (int range){
		 /**
		   * This method is used to generate a random number.
		   * @param range determine the range of number
		   * to generate within
		   * @return int number generated
		   */		
		return (int) (Math.random() * range) +1;
		
	}// end method
	
}// end game class
