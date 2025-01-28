import java.io.IOException;
import java.util.Scanner;

public class Main1173 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int [] v = new int[10];
        int n = ler.nextInt();

        for(int i = 0; i < 10; i++){
            v[i] = n;
            System.out.println("N["+ i +"] = " + n);
            n *= 2;
        }
    }
}
