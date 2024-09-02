import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        // Display company motto
        System.out.println("Sammy's Seashore Supplies");
        System.out.println("*************************");
        System.out.println("We have the best equipment for your beach needs!");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes you rented the equipment: ");
        int totalMinutes = scanner.nextInt();
        scanner.close();

        //Data Section
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        int pricePerHour = 40;
        int pricePerMinute = 1;
        int totalPrice = (hours * pricePerHour) + minutes;


        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Total Price: $" + totalPrice);
    }
}