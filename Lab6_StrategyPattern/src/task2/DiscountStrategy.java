package task2;

interface DiscountStrategy {
    double getDiscount();
    
}

class SampleDiscountStrategy implements DiscountStrategy{
    public double getDiscount() {
        return 0;
    }
    
}

class PercentageDiscountStrategy implements DiscountStrategy{
    double percentage;
    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
        // TODO Auto-generated constructor stub
    }
    public double getDiscount() {
        return percentage;
    }
    

}

class FixedDiscountStrategy implements DiscountStrategy{
    double discount;
    public FixedDiscountStrategy(double discount) {
        // TODO Auto-generated constructor stub
        this.discount = discount;
    }
    public double getDiscount() {
        return discount;
    }

    
}
