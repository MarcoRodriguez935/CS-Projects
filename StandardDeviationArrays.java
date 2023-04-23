// This program is a rewritten version, using arrays and methods, of a previous 
// homework assignment. In the assignment, the task was to find the mean 
// and standard deviation of inputted values using loops

import java.util.Scanner;

public class StandardDeviationArrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many values are there?: ");
		int n = input.nextInt();

		double[] values = readValues(n);

		double avg = getAverage(values);

		double standard_deviation = getStandardDeviation(values, avg);

		displayResults(standard_deviation, avg);

	}

	public static double[] readValues(int n) {
		Scanner input = new Scanner(System.in);

		double[] values = new double[n];

		System.out.print("\nEnter the values: ");

		for (int i = 0; i < values.length; i++) {
			values[i] = input.nextDouble();
		}

		return values;
	}

	public static double getAverage(double[] values) {

		double sum = 0;
		int n = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
			n++;
		}

		double avg = sum / n;

		return avg;
	}

	public static double getStandardDeviation(double[] values, double avg) {

		double summation = 0;
		int n = 0;

		for (int i = 0; i < values.length; i++) {
			summation += Math.pow((values[i] - avg), 2);
			n++;
		}

		double inner_eq = summation / (n-1);

		double sd = Math.sqrt(inner_eq);

		return sd;
	}

	public static void displayResults(double sd, double avg) {
		System.out.println("\nAverage of values: " + avg);
		System.out.println("Standard deviation: " + sd);
	}	
}