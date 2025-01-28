import java.io.IOException;
import java.util.Scanner;

public class Main1018 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int c = ler.nextInt();
        System.out.println(c);


        System.out.println((c / 100) + " nota(s) de R$ 100,00");
        c = c % 100;
        System.out.println((c / 50) +  " nota(s) de R$ 50,00");
        c = c % 50;
        System.out.println((c / 20) + " nota(s) de R$ 20,00");
        c = c % 20;
        System.out.println((c / 10) + " nota(s) de R$ 10,00");
        c = c % 10;
        System.out.println((c / 5) + " nota(s) de R$ 5,00");
        c = c % 5;
        System.out.println((c / 2) + " nota(s) de R$ 2,00");
        c = c % 2;
        System.out.println((c / 1) + " nota(s) de R$ 1,00");
    }
}
