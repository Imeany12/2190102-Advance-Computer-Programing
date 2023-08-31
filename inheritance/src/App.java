class Animal{
    protected String name;
    // sub-class can access this field
    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Animal" + name + "makes sound!");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("Dog" + name + "makes sound!");
    }

}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Cat" + name + "makes sound!");
    }
}


public class App {
    public static void animalDemo(){
        Animal a1 = new Animal("Animal 1");
        Animal a2 = new Dog("Dog 1");
        a1.makeSound();
        a2.makeSound();
        Animal[] animals = new Animal[5];
        animals[0] = new Animal("Animal 1");
        animals[1] = new Dog("Dog 1");
        animals[2] = new Dog("Dog 2");
        animals[3] = new Cat("Cat 1");
        animals[5] = new Cat("Cat 2");

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
    public static void main(String[] args) throws Exception {
        int[] number1 = new int[5];
        number1[0] = 10;
        number1[1] = 20;
        number1[2] = 30;
        number1[3] = 40;
        number1[4] = 50;
        System.out.println(number1[0]);

        int[] number2 = { 10, 20, 30, 40, 50 };
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }

        for (int i : number2) {
            System.out.println(i);
        }
        
    }
}
