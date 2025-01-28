import java.io.IOException;
import java.util.Scanner;

public class Main1006 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();
        double MEDIA = ((2 * A) + (3 * B) + (5 * C)) / 10.0;

        System.out.printf("MEDIA = %.1f", (MEDIA));
        System.out.println();
    }
}
