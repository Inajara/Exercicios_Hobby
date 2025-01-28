import java.io.IOException;
import java.util.Scanner;

public class Main1067 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int X = ler.nextInt();
        for(int N = 0; N <= X; N++){
            if(N % 2 != 0){
                System.out.println(N);
            }
        }
    }
}
