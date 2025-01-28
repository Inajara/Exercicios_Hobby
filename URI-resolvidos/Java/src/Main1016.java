import java.io.IOException;
import java.util.Scanner;

public class Main1016 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int d = ler.nextInt();
        int min = (60 * d) / 30;

        System.out.println(min + " minutos");
    }
}
