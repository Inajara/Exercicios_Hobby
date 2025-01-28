import java.io.IOException;
import java.util.Scanner;

public class Main1019 {
    public static void main(String[] args) throws IOException {

        Scanner d = new Scanner(System.in);

        int tempo = d.nextInt();
        int hora = tempo / 3600;
        int minuto = (tempo % 3600) / 60;
        int segundo = (tempo % 3600) % 60;

        System.out.printf("%d:%d:%d\n", hora, minuto, segundo);
    }
}
