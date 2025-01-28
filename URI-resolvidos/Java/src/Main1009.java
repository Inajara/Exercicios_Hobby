import java.io.IOException;
import java.util.Scanner;

public class Main1009 {
    public static void main(String[] args) throws IOException {

        Scanner x = new Scanner(System.in);

        String NAME = x.next();
        double f = x.nextDouble();
        double s = x.nextDouble();
        double SALARY = ((0.15 * s) + f);

        System.out.printf("TOTAL = R$ %.2f\n", (SALARY));
    }
}
