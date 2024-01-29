import java.util.Scanner;

public class casting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Celsius value you want to convert in Fahrenheit: ");
        int C = input.nextInt();
        float F = 9 * (float) C / 5 + 32;

        System.out.println("The Fahrenheit value is: " + (F));

    }
}
