package task1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<String> items;
    public double deliveryFee;

    public ShoppingCart() {
        this.items = new ArrayList<String>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public double calculateTotal() {
        double totalPrice = 0;
        for (int i = 0; i < items.size(); i++) {
            String[] item = items.get(i).split(":");
            totalPrice += Double.parseDouble(item[1]) * Double.parseDouble(item[2]);
        }
        return totalPrice;
    }

    public void addDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public double getNetPrice() {
        return calculateTotal() + deliveryFee;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    
    
}
