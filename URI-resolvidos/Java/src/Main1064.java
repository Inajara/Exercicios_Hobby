import java.io.IOException;
import java.util.Scanner;

public class Main1064 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int c = 0;
        double media = 0;
        double a;

        for(int i = 0; i < 6; i++){
            a = ler.nextDouble();
            if(a > 0){
                c++;
                media += a;
            }
        }
        media = media/c;
        System.out.println(c + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
