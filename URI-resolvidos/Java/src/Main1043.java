import java.io.IOException;
import java.util.Scanner;

public class Main1043 {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();
        double x = Math.max(a, Math.max(b, c));
        double y = 0;
        double z = 0;

        if(x == a){
            y = Math.max(b, c);
            z = Math.min(b, c);
        }
        if(x == b){
            y = Math.max(a, c);
            z = Math.min(a, c);
        }
        if(x == c){
            y = Math.max(b, a);
            z = Math.min(b, a);
        }

        if (x >= (y + z)) {
            double areaTrapezio = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", areaTrapezio);
        }else{
            double periTriangulo = a + b + c;
            System.out.printf("Perimetro = %.1f\n", periTriangulo);
        }
    }
}
