import java.util.Scanner;
public class Objective9Lab3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int selection;

		while(true){
			printMenu();

			selection = scanner.nextInt();

			if(selection == 1) {
			System.out.println("Hello Human");
			}
			if(selection == 2) {
			System.out.println("Apples, Bananas, Coconuts");	
			}
			if(selection == 3) {
			System.out.println("Goodbye");
			break;
		    }
		}
		scanner.close();
	    
	}
	public static void printMenu() {
		System.out.println("_______Menu________");
		System.out.println("1: Say Hello");
		System.out.println("2: List My favorite foods");
		System.out.println("3: Exit");
		System.out.println();
	}
}