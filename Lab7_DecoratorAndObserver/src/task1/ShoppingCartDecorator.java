package task1;

public class ShoppingCartDecorator extends ShoppingCart {
    public ShoppingCart cart;

    public ShoppingCartDecorator(ShoppingCart cart) {
        this.cart = cart;
    }

    @Override
    public double calculateTotal() {
        return cart.calculateTotal();
    }

    @Override
    public double getNetPrice() {
        return cart.getNetPrice();
    }

    @Override
    public double getDeliveryFee() {
        return cart.getDeliveryFee();
    }
    
}
