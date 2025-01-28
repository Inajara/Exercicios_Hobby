import java.io.IOException;
import java.util.Scanner;

public class Main1012 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        double A = ler.nextDouble();
        double B = ler.nextDouble();
        double C = ler.nextDouble();
        double pi = 3.14159;
        double AT = (A * C) / 2;
        double ACi = (C * C) * pi;
        double ATr = ((A + B) * C) / 2;
        double AQ = B * B;
        double AR = A * B;

        System.out.printf("TRIANGULO: %.3f\n", (AT));
        System.out.printf("CIRCULO: %.3f\n", (ACi));
        System.out.printf("TRAPEZIO: %.3f\n", (ATr));
        System.out.printf("QUADRADO: %.3f\n", (AQ));
        System.out.printf("RETANGULO: %.3f\n", (AR));
    }
}
