package DesignStategy;

public class App {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        Animal c1 = new Cat();
        Animal f1 = new Fish();
        Animal s1 = new Snake();
        d1.makeSound();
        c1.makeSound();
        f1.makeSound();
        s1.makeSound();
    }
}
