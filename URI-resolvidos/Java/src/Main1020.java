import java.io.IOException;
import java.util.Scanner;

public class Main1020 {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int idade = ler.nextInt();

        int ano = idade / 365;
        int mes = (idade % 365) / 30;
        int dia = idade % 365 % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}
