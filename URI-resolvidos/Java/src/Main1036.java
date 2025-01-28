import java.io.IOException;
import java.util.Scanner;

public class Main1036 {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        double A, B, C;
        A = ler.nextDouble();
        B = ler.nextDouble();
        C = ler.nextDouble();

        double BK = Math.pow(B, 2.00) - 4 * A * C;
        double R1, R2;
        R1 = ((-B + Math.sqrt(BK)) / (2.00 * A));
        R2 = ((-B - Math.sqrt(BK)) / (2.00 * A));

        if (BK < 0 || A == 0){
            System.out.println("Impossivel calcular");
        }else{
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
