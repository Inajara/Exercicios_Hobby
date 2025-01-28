import java.io.IOException;
import java.util.Scanner;

public class Main1175 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int [] v = new int[20];
        int n;

        for(int i = 0; i < v.length; i++){
            v[i] = ler.nextInt();
        }
        for(int i = 0; i < (v.length / 2); i++){
            n = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = n;
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println("N["+ i +"] = " + v[i]);
        }
    }
}
