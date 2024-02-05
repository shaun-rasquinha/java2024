import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class upgrad {

    public static void main(String args[]) {
        boolean check = true;
        functionA(check);
        System.out.print(check && !functionA(check));
    }

    public static boolean functionA(boolean a) {
        return !a;
    }

}
