import java.util.Scanner;

public class Objective4Lab2 {
	public static void main (String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first whole number you would like to add.");
		int num1 = keyboard.nextInt();

		System.out.println("Please enter the second whole number you would like to add.");
		int num2 = keyboard.nextInt();

		System.out.println("Please end the third whole number you would like to add.");
		int num3 = keyboard.nextInt();

		int numsum = num1 + num2 + num3;

		System.out.println("Please enter the first decimal number you would like to add.");
		double dub1 = keyboard.nextDouble();

		System.out.println("Please enter the second decimal number you would like to add.");
		double dub2 = keyboard.nextDouble();

		System.out.println("Please enter the third decimal number you would like to add.");
		double dub3 = keyboard.nextDouble();

		double dubsum = dub1 + dub2 + dub3;

		keyboard.close();

		System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + numsum);
		System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + dubsum);
	}
}