public class Object {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.length = 10f;
        System.out.println(s1.area());
        Square s2 = new Square();
        s2.length = 20f;
        System.out.println(s2.area());

    }
}

class Square {
    public float length;

    public float area() {
        return length * length;
    }
}
