import java.util.Scanner;

public class Practice_03 {
    public static void main(String[] args) {
        int myAge, ageOfBrother;
        Scanner input = new Scanner(System.in);
        myAge = input.nextInt();
        ageOfBrother = input.nextInt();

        if ((myAge < 25 && myAge > 0) && (ageOfBrother < 25 && ageOfBrother > 0)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
