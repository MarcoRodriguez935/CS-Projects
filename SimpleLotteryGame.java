// Goal: Allow user to choose lottery difficulty and enter five guesses 
// Input 1: Difficulty level (easiest), (easy), (normal), (difficult)
// Input 2: Five guesses
// Generate five random numbers
// If guesses == random numbers, increment guess count by 1
import java.util.Scanner;

public class SimpleLotteryGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		final int MIN = 0;

		final int MAX1 = 10;

		final int MAX2 = 20;

		final int MAX3 = 50;

		final int MAX4 = 100;

		int random_num1;
		int random_num2;
		int random_num3;
		int random_num4;
		int random_num5;

		int match_count = 0;

		System.out.println("-------LOTTERY GAME-------");
		System.out.println();
		System.out.println("(1)   (0 - 10)");
		System.out.println("(2)   (0 - 20)");
		System.out.println("(3)   (0 - 50)");
		System.out.println("(4)   (0 - 100)");
		System.out.println();
		System.out.print("Enter a number range: ");

		int range_choice = input.nextInt();

		System.out.println();

		if (range_choice == 1) {
			random_num1 = (int)(Math.random() * (MAX1 + 1));
			random_num2 = (int)(Math.random() * (MAX1 + 1));
			random_num3 = (int)(Math.random() * (MAX1 + 1));
			random_num4 = (int)(Math.random() * (MAX1 + 1));
			random_num5 = (int)(Math.random() * (MAX1 + 1));

			System.out.print("Enter five guesses from (0 - 10): ");
			int guess1 = input.nextInt();
			int guess2 = input.nextInt();
			int guess3 = input.nextInt();
			int guess4 = input.nextInt();
			int guess5 = input.nextInt();

			if (guess1 == random_num1) {
				match_count += 1;
			}
			if (guess2 == random_num2) {
				match_count += 1;
			}
			if (guess3 == random_num3) {
				match_count += 1;
			}
			if (guess4 == random_num4) {
				match_count += 1;
			}
			if (guess5 == random_num5) {
				match_count += 1;
			}
			System.out.println();
			System.out.println("Lottery Numbers: " + random_num1 + " " + random_num2 + " " +
			random_num3 + " " + random_num4 + " " + random_num5);
			System.out.println("Your Numbers:    " + guess1 + " " + guess2 + " " + guess3 + " " 
				+ guess4 + " " + guess5);
			System.out.println();
			System.out.println("You matched " + match_count + " number(s)");
			System.out.println();
			System.out.println("--------------------------");
		}
		else if (range_choice == 2) {
			random_num1 = (int)(Math.random() * (MAX2 + 1));
			random_num2 = (int)(Math.random() * (MAX2 + 1));
			random_num3 = (int)(Math.random() * (MAX2 + 1));
			random_num4 = (int)(Math.random() * (MAX2 + 1));
			random_num5 = (int)(Math.random() * (MAX2 + 1));

			System.out.print("Enter five guesses from (0 - 20): ");
			int guess1 = input.nextInt();
			int guess2 = input.nextInt();
			int guess3 = input.nextInt();
			int guess4 = input.nextInt();
			int guess5 = input.nextInt();

			if (guess1 == random_num1) {
				match_count += 1;
			}
			if (guess2 == random_num2) {
				match_count += 1;
			}
			if (guess3 == random_num3) {
				match_count += 1;
			}
			if (guess4 == random_num4) {
				match_count += 1;
			}
			if (guess5 == random_num5) {
				match_count += 1;
			}
			System.out.println();
			System.out.println("Lottery Numbers: " + random_num1 + " " + random_num2 + " " +
			random_num3 + " " + random_num4 + " " + random_num5);
			System.out.println("Your Numbers:    " + guess1 + " " + guess2 + " " + guess3 + " " 
				+ guess4 + " " + guess5);
			System.out.println();
			System.out.println("You matched " + match_count + " number(s)");
			System.out.println();
			System.out.println("--------------------------");
		}
		else if (range_choice == 3) {
			random_num1 = (int)(Math.random() * (MAX3 + 1));
			random_num2 = (int)(Math.random() * (MAX3 + 1));
			random_num3 = (int)(Math.random() * (MAX3 + 1));
			random_num4 = (int)(Math.random() * (MAX3 + 1));
			random_num5 = (int)(Math.random() * (MAX3 + 1));

			System.out.print("Enter five guesses from (0 - 50): ");
			int guess1 = input.nextInt();
			int guess2 = input.nextInt();
			int guess3 = input.nextInt();
			int guess4 = input.nextInt();
			int guess5 = input.nextInt();

			if (guess1 == random_num1) {
				match_count += 1;
			}
			if (guess2 == random_num2) {
				match_count += 1;
			}
			if (guess3 == random_num3) {
				match_count += 1;
			}
			if (guess4 == random_num4) {
				match_count += 1;
			}
			if (guess5 == random_num5) {
				match_count += 1;
			}
			System.out.println();
			System.out.println("Lottery Numbers: " + random_num1 + " " + random_num2 + " " +
			random_num3 + " " + random_num4 + " " + random_num5);
			System.out.println("Your Numbers:    " + guess1 + " " + guess2 + " " + guess3 + " " 
				+ guess4 + " " + guess5);
			System.out.println();
			System.out.println("You matched " + match_count + " number(s)");
			System.out.println();
			System.out.println("--------------------------");
		}
		else if (range_choice == 4) {
			random_num1 = (int)(Math.random() * (MAX4 + 1));
			random_num2 = (int)(Math.random() * (MAX4 + 1));
			random_num3 = (int)(Math.random() * (MAX4 + 1));
			random_num4 = (int)(Math.random() * (MAX4 + 1));
			random_num5 = (int)(Math.random() * (MAX4 + 1));

			System.out.print("Enter five guesses from (0 - 100): ");
			int guess1 = input.nextInt();
			int guess2 = input.nextInt();
			int guess3 = input.nextInt();
			int guess4 = input.nextInt();
			int guess5 = input.nextInt();

			if (guess1 == random_num1) {
				match_count += 1;
			}
			if (guess2 == random_num2) {
				match_count += 1;
			}
			if (guess3 == random_num3) {
				match_count += 1;
			}
			if (guess4 == random_num4) {
				match_count += 1;
			}
			if (guess5 == random_num5) {
				match_count += 1;
			}
			System.out.println();
			System.out.println("Lottery Numbers: " + random_num1 + " " + random_num2 + " " +
			random_num3 + " " + random_num4 + " " + random_num5);
			System.out.println("Your Numbers:    " + guess1 + " " + guess2 + " " + guess3 + " " 
				+ guess4 + " " + guess5);
			System.out.println();
			System.out.println("You matched " + match_count + " number(s)");
			System.out.println();
			System.out.println("--------------------------");
		}
		else {
			System.out.println("Invalid Option");
		}
	}
} 