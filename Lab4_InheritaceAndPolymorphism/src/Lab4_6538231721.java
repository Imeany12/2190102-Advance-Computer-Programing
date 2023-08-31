abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract void printDetails();

    public String getColor() {
        return color;
    }

    public abstract void resize(double factor);
}

class Square extends Shape {
    private double length;

    public Square(int length, String color) {
        super(color);
        this.length = length;
    }

    public double getArea() {
        return length * length;
    }

    public void printDetails() {
        double area = this.getArea();
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Color: " + color);
        // System.out.println("Side Length: "+ String.format("%.1f",length ));
        System.out.println("Side Length: " + length);
        System.out.println("Area: " + area);
    }

    public void resize(double factor) {
        this.setLength(length * Math.pow(factor, 0.5));
    }

    public void setLength(double length) {
        this.length = length;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public void printDetails() {
        double area = this.getArea();
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Color: " + color);
        System.out.println("width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
    }

    public void resize(double factor) {
        this.setWidth(width * (Math.pow(factor, 0.5)));
        this.setHeight(height * (Math.pow(factor, 0.5)));
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}

class Circle extends Shape {
    private double radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return (double) Math.PI * radius * radius;
    }

    public void printDetails() {
        double area = this.getArea();
        System.out.println("Shape: " + this.getClass().getSimpleName());
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }

    public void resize(double factor) {
        this.setRadius(radius * (Math.pow(factor, 0.5)));
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}

public class Lab4_6538231721 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Square(5, "Red");
        shapes[1] = new Square(1, "Blue");
        shapes[1].resize(9);
        shapes[2] = new Rectangle(2, 3, "Green");
        shapes[2].resize(4);
        shapes[3] = new Rectangle(2, 8, "Yellow");
        shapes[4] = new Circle(7, "Orange");
        for (Shape shape : shapes) {
            shape.printDetails();
            System.out.println("----------------------");
        }
    }

}
