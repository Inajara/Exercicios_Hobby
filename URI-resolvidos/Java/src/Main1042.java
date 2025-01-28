import java.io.IOException;
import java.util.Scanner;

public class Main1042 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int m1 = Math.min(a, Math.min(b, c));
        int m2 = 0;
        int m3 = 0;

        if(a == m1){
            m2 = Math.min(b, c);
            m3 = Math.max(b, c);
        }
        if(b == m1){
            m2 = Math.min(a, c);
            m3 = Math.max(a, c);
        }
        if(c == m1){
            m2 = Math.min(a, b);
            m3 = Math.max(a, b);
        }
        System.out.print(m1 + "\n" + m2 + "\n" + m3 + "\n\n");
        System.out.print(a + "\n" + b + "\n" + c + "\n");
    }
}
