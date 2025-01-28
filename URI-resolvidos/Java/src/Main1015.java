import java.io.IOException;
import java.util.Scanner;

public class Main1015 {
    public static void main(String[] args) throws IOException {

        double x1, x2, y1, y2, dist;
        Scanner ler = new Scanner(System.in);
        x1 = ler.nextDouble();
        y1 = ler.nextDouble();
        x2 = ler.nextDouble();
        y2 = ler.nextDouble();
        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("%.4f\n", dist);
    }
}
