public class Billing {
    
    //so the purpose of this code is to actually know what is overloading
    public void computeBill(double price) {
        double total = price * 1.08; 
        System.out.printf("Total bill: $%.2f%n", total);
    }

    public void computeBill(double price, int quantity) {
        double subtotal = price * quantity;
        double total = subtotal * 1.08;
        System.out.printf("Total bill: $%.2f%n", total);
    }

    public void computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discountAmount = (subtotal * couponDiscount) / 100;
        double total = (subtotal - discountAmount) * 1.08; 
        System.out.printf("Total bill: $%.2f%n", total);
    }
    
    public static void main(String[] args) {
        Billing billing = new Billing();
        billing.computeBill(23.2);
        billing.computeBill(10.5, 2);
        billing.computeBill(15.0, 3, 10);
    }
}