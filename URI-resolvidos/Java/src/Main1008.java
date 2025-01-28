import java.io.IOException;
import java.util.Scanner;

public class Main1008 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int NUMBER = ler.nextInt();
        int w = ler.nextInt();
        float p = ler.nextFloat();
        float SALARY = (w * p);

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", (SALARY));
    }
}
