import java.util.Scanner;

public class strings_char {
    public static void main(String[] args) {
        String name;
        int year;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        year = input.nextInt();
        System.out.println("Hello " + name);
        System.out.println("Free services till:" + (year + 4));
    }
}
