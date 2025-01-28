import java.io.IOException;
import java.util.Scanner;

public class Main1060 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int c = 0;

        for(int i = 0; i < 6; i++){
            double a = ler.nextDouble();
            if(a > 0){
                c++;
            }
        }
        System.out.println(c + " valores positivos");
    }
}
