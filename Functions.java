import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println(squareOfSum(num1, num2));

    }

    public static int squareOfSum(int a, int b) {
        int sum = (a + b) * (a + b);
        return sum;

    }
}
