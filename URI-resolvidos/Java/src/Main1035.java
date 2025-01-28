import java.io.IOException;
import java.util.Scanner;

public class Main1035 {
    public static void main(String[] args) throws IOException {

        Scanner x = new Scanner(System.in);
        int A = x.nextInt();
        int B = x.nextInt();
        int C = x.nextInt();
        int D = x.nextInt();
        int s1 = C + D;
        int s2 = A + B;

        if ((B > C) && (D > A) && (C + D > A + B) && C > 0 && D > 0 && (A % 2 == 0)){
            System.out.printf("Valores aceitos\n");
        }else {
            System.out.printf("Valores nao aceitos\n");
        }
    }
}
