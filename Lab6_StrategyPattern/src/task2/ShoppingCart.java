package task2;

public class ShoppingCart {
    private Item[] items;
    private DiscountStrategy discountStrategy;

    public ShoppingCart() {
        items = new Item[0];
        discountStrategy = new SampleDiscountStrategy(); // Default strategy
    }

    public void getDiscountStrategy() {
        System.out.println(discountStrategy.getClass().getSimpleName());
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void addItem(Item item) {
        // Extend the array to accommodate the new item
        Item[] newItems = new Item[items.length + 1];
        if (items.length != 0){
            for(int i=0;i < items.length;i++){
            newItems[i] = items[i];
            }
            newItems[items.length] = item;
            items = newItems;
        } else {
            newItems[0] = item;
            items = newItems;
        }
    }
        
            
    

    public void calculateTotal(){
        String strategy = discountStrategy.getClass().getSimpleName();
        double total = 0;
        if (strategy.equals("PercentageDiscountStrategy")){
            for (int i = 0; i < items.length; i++) {
                total += items[i].getPrice() * items[i].getQuantity();
            }
            System.out.println(total * (100 - discountStrategy.getDiscount()) / 100); 
        }
        else if (strategy.equals("FixedDiscountStrategy")){
            for (int i = 0; i < items.length; i++) {
                total += items[i].getPrice() * items[i].getQuantity();
            }
            System.out.println( total - discountStrategy.getDiscount());
        }
        else{
            for (int i = 0; i < items.length; i++) {
                total += items[i].getPrice() * items[i].getQuantity();
            }
            System.out.println(total);
        }
    }
}
