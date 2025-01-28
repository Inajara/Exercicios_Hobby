import java.io.IOException;
import java.util.Scanner;

public class Main1073 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int N = ler.nextInt();
        for(int i = 1; i <= N; i++){
            if(i % 2 == 0){
                System.out.println(i + "^2 = " + (int)Math.pow(i, 2));
            }
        }
    }
}
