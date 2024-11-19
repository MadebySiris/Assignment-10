import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the game type
        System.out.print("What is the name of the game we are playing? (football, basketball, soccer, or tennis): ");
        String gametype = scanner.nextLine().toLowerCase();

        // Create a game instance
        Game game1 = new Game(gametype);

        // Display game rules and scoreboard
        game1.gamerules();
        game1.scoreboard();

        scanner.close();
    }
}
