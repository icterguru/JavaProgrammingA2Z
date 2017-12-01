package chapter05;
import java.util.Scanner;



public class J05_20 {


	public static final boolean CHEAT = true;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int amountOfPlayers;
		do {
			System.out.print("Select the amount of players (1/2): ");
			while (!scanner.hasNextInt()) {
				System.out.println("That's not a number!");
				scanner.next(); // this is important!
			}

			amountOfPlayers = scanner.nextInt();
		} while ((amountOfPlayers <= 0) || (amountOfPlayers > 2));
		if(scanner != null) {
			scanner.close();
		}
		System.out.println("You've selected " + amountOfPlayers+" player(s).");

	}	// End of main()
} // End of class

