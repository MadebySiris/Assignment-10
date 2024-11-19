public class CusineChoice extends Food {
    private String culture;
    private int price;
    private String amount;

    // Method to set food details
    @Override
    public void food(String culture, int price, String amount) {
        this.culture = (culture);
        this.price = price;
        this.amount = (amount);

        if (price >= 25 && amount.equalsIgnoreCase("small")) {
            System.out.println("You got scammed.");
        } else if (price >= 25  || price >=35 && amount.equalsIgnoreCase("medium")) {
            System.out.println("You got an okay deal.");
        } else if (price <= 25 && amount.equalsIgnoreCase("large")) {
            System.out.println("You've gotten a good deal.");
        }
    }

    // Method to display information about the dish
    public void infodump() {
        System.out.println("The dish you've chosen is " + this.culture + 
            " and we hope you enjoy your food!");
        System.out.println("You bought a " + this.amount + " plate for $" + this.price);
    }

   
}
