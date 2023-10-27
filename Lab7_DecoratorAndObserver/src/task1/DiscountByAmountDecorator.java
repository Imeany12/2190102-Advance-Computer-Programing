package task1;

public class DiscountByAmountDecorator extends ShoppingCartDecorator {
    public double discountAmount;

    public DiscountByAmountDecorator(ShoppingCart cart, double discountAmount) {
        super(cart);
        this.discountAmount = discountAmount;
    }

    @Override
    public double getNetPrice() {
        return cart.getNetPrice() - discountAmount;
    }
    
}
