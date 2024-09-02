import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
 
        System.out.println("Carly's Catering");
        System.out.println("*****************");
        System.out.println("We make every event a special one!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of guests attending the event: ");
        int numGuests = scanner.nextInt();
        scanner.close();


        int pricePerGuest = 35;
        int totalPrice = numGuests * pricePerGuest;
        boolean isLargeEvent = numGuests >= 50;


        System.out.println("\nEvent Details:");
        System.out.println("Number of Guests: " + numGuests);
        System.out.println("Price per Guest: $" + pricePerGuest);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Is this a large event? " + isLargeEvent);
    }
}
