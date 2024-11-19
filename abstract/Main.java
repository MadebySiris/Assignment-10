import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the culture of the dish: ");
        String culture = scanner.nextLine();

        System.out.print("Enter the price of the dish: ");
        int price = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter the size of the plate (small, medium, large): ");
        String amount = scanner.nextLine();

        
        CusineChoice plate = new CusineChoice();
        plate.food(culture, price, amount);
        plate.infodump();

        scanner.close(); 
    }
}
