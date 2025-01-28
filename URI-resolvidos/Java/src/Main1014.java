import java.io.IOException;
import java.util.Scanner;

public class Main1014 {
    public static void main(String[] args) throws IOException {

        Scanner a = new Scanner(System.in);

        int x = a.nextInt();
        float y = a.nextFloat();

        float c = x / y;

        System.out.printf("%.3f km/l\n", (c));
    }
}
