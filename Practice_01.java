import java.util.Scanner;

// You can follow these steps: 1) For the number in the ten thousands place, divide by 10000. Since dividing 2 integers gives back an integer, you will get 2 in this case, which is the number in the ten thousands place. 2) For the number in the thousands place, use the ‘%’ operator. Calculate the remainder on dividing by 10000. In this case, it will be 3456. Then, divide this number by 1000. You will get 3, which is the required result. 3) For the number in the hundreds place, calculate the remainder on dividing by 1000. Divide that remainder by 100. 4) For the number in the ones place, just calculate the remainder on dividing by 10.

public class Practice_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Values of each digit
        int tenThousands, thousands, hundreds, tens, ones;

        // Prompt user to input 5 digit number

        int number = input.nextInt();
        if (number > 99999) {
            System.out.println("\nError! Number more than 5 digits.");
        } else if (number < 10000) {
            System.out.println("Error! Number less than 5 digits.");
        } else if (10000 <= number && number <= 99999) {
            // WRITE YOUR CODE HERE
            tenThousands = (number / 10000);
            System.out.println(tenThousands);
            thousands = (number % 10000);
            thousands = (thousands / 1000);
            System.out.println(thousands);
            hundreds = (number % 1000);
            hundreds = (hundreds / 100);
            System.out.println(hundreds);
            tens = (number % 100);
            tens = tens / 10;
            System.out.println(tens);
            ones = number % 10;
            System.out.println(ones);

        }

    }
}
