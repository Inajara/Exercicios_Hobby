import java.io.IOException;
import java.util.Scanner;

public class Main1177 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int [] v = new int[1000];
        int n = ler.nextInt();

        if(n >= 2 && n <= 50){
            for (int i = 0, j = 0; i < 1000; j++, i++) {
                v[j] = j;
                if ((v[j]) == n) {
                    j = 0;
                }
                System.out.print("N[" + i + "] = " + v[j] + "\n");
            }
        }
    }
}
