import java.io.IOException;
import java.util.Scanner;

public class Main1011 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        double pi = 3.14159;
        double R = ler.nextFloat();
        double VOLUME = ((4.0 / 3) * pi * (Math.pow(R , 3)));

        System.out.printf("VOLUME = %.3f\n", (VOLUME));
    }
}
