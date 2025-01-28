import java.io.IOException;
import java.util.Scanner;

public class Main1017 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int t = ler.nextInt();
        int vm = ler.nextInt();

        double d = vm * t;
        double vol = d / 12;

        System.out.printf("%.3f\n", vol);
    }
}
