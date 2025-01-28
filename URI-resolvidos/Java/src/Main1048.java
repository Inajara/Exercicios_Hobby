import java.io.IOException;
import java.util.Scanner;

public class Main1048 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        float S = ler.nextFloat();

        if (S <= 400.0)
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 15 %%\n", S * 1.15, S * 0.15);
        else if (S <= 800.0)
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 12 %%\n", S * 1.12, S * 0.12);
        else if (S <= 1200.0)
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 10 %%\n", S * 1.10, S * 0.10);
        else if (S <= 2000.0)
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 7 %%\n", S * 1.07, S * 0.07);
        else
            System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: 4 %%\n", S * 1.04, S * 0.04);
    }
}
