public class Method_overriding {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(10, 20);
        Shape s3 = new Triangle(15, 30);

        System.out.println(s1.calculateArea());
        System.out.println(s2.calculateArea());
        System.out.println(s3.calculateArea());
    }
}

interface Shape {

    public abstract double calculateArea();
}

class Circle implements Shape {
    private double PI = 3.14;
    protected double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }
}

class Rectangle implements Shape {
    protected int width;
    protected int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double calculateArea() {
        return length * width;
    }

}

class Triangle implements Shape {
    protected double base;
    protected double height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

}
