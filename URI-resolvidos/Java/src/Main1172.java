import java.io.IOException;
import java.util.Scanner;

public class Main1172 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int [] X = new int [10];

        for(int i = 0; i < X.length; i++) {
            X[i] = ler.nextInt();
            if (X[i] <= 0) {
                X[i] = 1;
            }
            System.out.println("X[" + i + "] = " + X[i]);
        }
    }
}
