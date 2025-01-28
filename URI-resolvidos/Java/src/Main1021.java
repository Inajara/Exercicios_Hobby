import java.io.IOException;
import java.util.Scanner;

public class Main1021 {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        double dinheiro = ler.nextDouble();

        System.out.println("NOTAS:");
        System.out.println((int)(dinheiro / 100) + " nota(s) de R$ 100.00");
        dinheiro = dinheiro % 100;
        System.out.println((int)(dinheiro / 50) +  " nota(s) de R$ 50.00");
        dinheiro = dinheiro % 50;
        System.out.println((int)(dinheiro / 25) + " nota(s) de R$ 20.00");
        dinheiro = dinheiro % 25;
        System.out.println((int)(dinheiro / 10) + " nota(s) de R$ 10.00");
        dinheiro = dinheiro % 10;
        System.out.println((int)(dinheiro / 5) + " nota(s) de R$ 5.00");
        dinheiro = dinheiro % 5;
        System.out.println((int)(dinheiro / 2) + " nota(s) de R$ 2.00");

        dinheiro = dinheiro % 2;
        dinheiro = dinheiro *100;

        System.out.println("MOEDAS:");
        System.out.println((int)(dinheiro / 100) + " moeda(s) de R$ 1.00");
        dinheiro = dinheiro % 100;
        System.out.println((int)(dinheiro / 50) +  " moeda(s) de R$ 0.50");
        dinheiro = dinheiro % 50;
        System.out.println((int)(dinheiro / 20) + " moeda(s) de R$ 0.25");
        dinheiro = dinheiro % 25;
        System.out.println((int)(dinheiro / 10) + " moeda(s) de R$ 0.10");
        dinheiro = dinheiro % 10;
        System.out.println((int)(dinheiro / 5) + " moeda(s) de R$ 0.05");
        dinheiro = dinheiro % 5;
        System.out.println((int)(dinheiro) + " moeda(s) de R$ 0.01");
    }
}
