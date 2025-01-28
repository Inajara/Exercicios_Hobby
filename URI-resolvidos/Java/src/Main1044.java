import java.io.IOException;
import java.util.Scanner;

public class Main1044 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int m = ler.nextInt();
        int n = ler.nextInt();

        if(m % n == 0 || n % m == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
