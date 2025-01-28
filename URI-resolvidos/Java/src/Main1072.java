import java.io.IOException;
import java.util.Scanner;

public class Main1072 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();
        int in = 0;
        int out = 0;
        for(int i = 0; i < N; i++){
            int X = ler.nextInt();
            if(X >= 10 && X <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
