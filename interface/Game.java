public class Game implements Gamestip {
    private String gametype;

    // Constructor to set the game type
    public Game(String gametype) {
        this.gametype = gametype;
    }

    @Override
    public void gamerules() {
        if (gametype.equals("football")) {
            System.out.println("4 quarters, 8 mins each, tackle football on a small field.");
        } else if (gametype.equals("tennis")) {
            System.out.println("We are playing doubles, so gather your partner and get ready for battle.");
        } else if (gametype.equals("basketball")) {
            System.out.println("No tall people are allowed to play; it's only fair!");
        } else if (gametype.equals("soccer")) {
            System.out.println("Good luck, teams! Be ready to commence.");
        } else {
            System.out.println("Invalid game type. Please choose between football, basketball, soccer, or tennis.");
        }
    }

    @Override
    public void scoreboard() {
        if (gametype.equals("football")) {
            System.out.println("A touchdown is 7 points, a field goal is 3 points. All one-handed catches in the end zone are worth 9 points.");
        } else if (gametype.equals("tennis")) {
            System.out.println("If you score more than 5 points straight, you get an extra timeout.");
        } else if (gametype.equals("basketball")) {
            System.out.println("There are 2 and 3 pointers, but any 40-footers are worth 4 points.");
        } else if (gametype.equals("soccer")) {
            System.out.println("No flopping, please! In the 80-minute match, goals scored from 35 feet or further are worth 2 points.");
        } else {
            System.out.println("Invalid game type. Please choose between football, basketball, soccer, or tennis.");
        }
    }
}
