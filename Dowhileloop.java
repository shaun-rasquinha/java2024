import java.util.Scanner;

public class Dowhileloop {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int counter = 0;
        do {
            n = n / 10;
            counter = counter + 1;
        } while (n > 0);
        System.out.print(counter);
    }
}
