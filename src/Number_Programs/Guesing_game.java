package Number_Programs;

import java.util.Scanner;

public class Guesing_game {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int secretNumber = (int) (Math.random() * 100) + 1; // Generate a random number between 1 and 100
	        int guess;
	        int attempts = 0;
	        boolean correct = false;

	        System.out.println("Welcome to the Guessing Game!");
	        System.out.println("Try to guess the secret number between 1 and 100.");

	        while (!correct) {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            attempts++;

	            if (guess == secretNumber) {
	                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
	                correct = true;
	            } else if (guess < secretNumber) {
	                System.out.println("Too low! Try again.");
	            } else {
	                System.out.println("Too high! Try again.");
	            }
	        }

	        scanner.close();
	    }
	}