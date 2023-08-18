public class Doll{
    private String name;
    private String material;
    private float price;

    public Doll(String name, String material, float price){
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String toString(){
        return name;
    }

    public void play(){
        System.out.println("I don't know. How to play");
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Price: $" + price);
    }

    public boolean isFragile(){
        return material.equals("Porcelain") || material.equals("Glass");
    }
}