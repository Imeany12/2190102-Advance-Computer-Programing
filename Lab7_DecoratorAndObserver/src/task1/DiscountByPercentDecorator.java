package task1;

public class DiscountByPercentDecorator extends ShoppingCartDecorator {
    public double discountPercent;

    public DiscountByPercentDecorator(ShoppingCart cart, double discountPercent) {
        super(cart);
        this.discountPercent = discountPercent;
    }

    @Override
    public double getNetPrice() {
        return (cart.calculateTotal() * (1 - discountPercent / 100)) + cart.deliveryFee;
    }
    
}
