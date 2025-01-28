import java.io.IOException;
import java.util.Scanner;

public class Main1010 {
    public static void main(String[] args) throws IOException {

        int a, b;
        double c, res;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();
        res = b * c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextDouble();
        res += b * c;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", (res));
    }
}
