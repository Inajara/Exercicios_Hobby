import java.io.IOException;
import java.util.Scanner;

public class Main1005 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double MEDIA = ((3.5 * a) + (7.5 * b)) / 11;

        System.out.printf("MEDIA = %.5f",(MEDIA));
        System.out.println();
    }
}
