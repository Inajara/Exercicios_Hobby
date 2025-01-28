import java.io.IOException;
import java.util.Scanner;

public class Main1066 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int c = 0, d = 0, e = 0, f = 0;

        for(int i = 0; i < 5; i++){
            double a = ler.nextDouble();
            if (a % 2 == 0){
                e++;
            }else{
                f++;
            }
            if(a > 0){
                c++;
            }
            if(a < 0){
                d++;
            }
        }
        System.out.println(e + " valor(es) par(es)");
        System.out.println(f + " valor(es) impar(es)");
        System.out.println(c + " valor(es) positivo(s)");
        System.out.println(d + " valor(es) negativo(s)");
    }
}
