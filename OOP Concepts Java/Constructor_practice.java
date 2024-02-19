public class Constructor_practice {
    public static void main(String[] a) {
        Circle c1 = new Circle(10f);
        System.out.println("area of circle = " + c1.area());

        Circle c2 = new Circle(20f);
        System.out.println("area of circle = " + c2.area());

        Circle c3 = new Circle(30f);
        System.out.println("area of circle = " + c3.area());
    }
}

class Circle {
    public float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    private float square(float radius) {
        return this.radius * this.radius;
    }

    public float area() {
        return 3.141f * square(this.radius);
    }
}
