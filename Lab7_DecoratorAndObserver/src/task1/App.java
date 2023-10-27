package task1;

public class App {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem("Item1:2:50.0"); // net price is 100.0
        cart.addItem("Item2:1:30.0"); // net price is 130.0

        // Add delivery fee
        cart.addDeliveryFee(10); // Add a $10 delivery fee

        // Apply coupons using decorators
        cart = new DiscountByPercentDecorator(cart, 10.0); // Apply a 10% discount, net price should be 127.0 (130*0.9+10)
        cart = new FreeDeliveryDecorator(cart); // Apply free delivery, net price now is 117.0

        // Calculate and display the total price and net price
        double total = cart.calculateTotal();
        double netPrice = cart.getNetPrice();
        System.out.println("Total Price: $" + total);
        System.out.println("Net Price: $" + netPrice);

        cart = new DiscountByAmountDecorator(cart, 17);
        System.out.println("Net Price: $" + cart.getNetPrice());

        
    }
    
}
