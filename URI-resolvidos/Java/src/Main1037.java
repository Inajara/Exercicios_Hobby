import java.io.IOException;
import java.util.Scanner;

public class Main1037 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        float i = ler.nextFloat();

        if (i >= 0 && i <= 25.0000){
            System.out.println("Intervalo [0,25]");
        }else if (i >= 25.00001 && i <= 50.0000000){
            System.out.println("Intervalo (25,50]");
        }else if(i >= 50.00001 && i <= 75.0000000){
            System.out.println("Intervalo (50,75]");
        }else if(i >= 75.00001 && i <= 100.0000000){
            System.out.println("Intervalo (75,100]");
        }else{
            System.out.println("Fora de intervalo");
        }
    }
}
