import java.util.Scanner;

public class Nested_elseif {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if (n1 < n2) {
            if (n1 < n3) {
                System.out.println("The smallest number entered is " + n1);
            } else {
                System.out.println("The smallest number entered is " + n3);
            }
        } else {
            if (n2 < n3) {
                System.out.println("The smallest number is " + n2);
            } else {
                System.out.println("The smallest number is " + n3);
            }
        }
    }
}
// Considered that the numbers are n1, n2 and n3.

// IF n1<n2

// IF n1<n3

// DISPLAY "The smallest number entered is "n1;

// ELSE

// DISPLAY "The smallest number entered is "n3;

// ELSE

// IF n2<n3

// DISPLAY "The smallest number entered is "n2;

// ELSE

// System.out.println("The smallest number entered is "+n3);