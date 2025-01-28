import java.io.IOException;
import java.util.Scanner;

public class Main1045 {
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
            System.out.print("NAO FORMA TRIANGULO\n");

        }else if (x * x > ((y * y) + (z * z))) {
            System.out.print("TRIANGULO OBTUSANGULO\n");
        }
        if (x * x == ((y * y) + (z * z))) {
            System.out.print("TRIANGULO RETANGULO\n");
        }

        if (x * x < ((y * y) + (z * z))) {
            System.out.print("TRIANGULO ACUTANGULO\n");
        }
        if ((x == y) && (x == z)) {
            System.out.print("TRIANGULO EQUILATERO\n");
        }
        if (((x == y) && (x != z)) || ((x == z) && (x != y)) || ((y == z) && (y != x)) ) {
            System.out.print("TRIANGULO ISOSCELES\n");
        }
    }
}
