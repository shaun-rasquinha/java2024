public class Inheritance {

    public static void main(String[] args) {
        Display obj = new Display();
        obj.Display();
    }
}

class Display {
    public Display(int i) {
        System.out.println("ONE");
    }

    public Display() {
        this(1);

        System.out.println("TWO");
    }

    void Display() {
        Display(1);

        System.out.println("THREE");
    }

    void Display(int i) {
        System.out.println("FOUR");
    }
}

class Coffee {
    protected void order() {
        System.out.println("Coffee");
    }

    public void getOrder() {
        this.order();
    }
}

class Shape {
    public Shape() {
        System.out.println("inside Shape class default constructor");
    }

}

class Rectangle extends Shape {
    public Rectangle() {
        System.out.println("inside Rectangle class default constructor");
    }
}

class Square extends Rectangle {
    public Square() {
        System.out.println("inside Square class default constructor");
    }
}
