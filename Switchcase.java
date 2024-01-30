import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        switch (n) {
            case 1:
                System.out.println("Hufflepuff");
                break;
            case 2:
                System.out.println("Gryffindor");
                break;
            case 3:
                System.out.println("Slytherin");
                break;
            case 4:
                System.out.println("Ravenclaw");
                break;

            default:
                System.out.println("Enter a number from 1 to 4");
                break;
        }
    }
}
