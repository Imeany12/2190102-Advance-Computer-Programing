package task2;

public class App {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("Widget", 3, 10.99);
        Item item2 = new Item("Gadget", 2, 19.99);

        cart.addItem(item1);
        cart.addItem(item2);

        // Your cart should set different discount strategies and display the total cost after discount.
        // ShoppingCart cart1 = new ShoppingCart();
        cart.setDiscountStrategy(new PercentageDiscountStrategy(10));
        System.out.println("PercentageDiscountStrategy");
        cart.calculateTotal();
        System.out.println();

        cart.setDiscountStrategy(new FixedDiscountStrategy(5.99));
        System.out.println("FixedDiscountStrategy");
        cart.calculateTotal();

        Item item3 = new Item("iPhone 15", 2, 999.99);
        Item item4 = new Item("iPhone 15 plus", 1, 1099.99);
        Item item5 = new Item("iPhone 15 pro", 3, 1199.99);

        for (int i = 0; i < 3; i++) {
            cart.addItem(item3);
            cart.addItem(item4);
            cart.addItem(item5);
        }

        System.out.println();
        System.out.println("After adding 3 more items");

        cart.setDiscountStrategy(new PercentageDiscountStrategy(5));
        System.out.println("PercentageDiscountStrategy");
        cart.calculateTotal();
        System.out.println();

        cart.setDiscountStrategy(new FixedDiscountStrategy(200));
        System.out.println("FixedDiscountStrategy");
        cart.calculateTotal();
    }
    
}
