import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Exceptions1 {
    public static void main(String[] args) throws IOException {
        // Enter a string in the input console
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        String inData;
        inData = stdin.readLine();

        System.out.println("You wrote: " + inData);

    }
}
