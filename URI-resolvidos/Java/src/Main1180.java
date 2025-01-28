import java.io.IOException;
import java.util.Scanner;

public class Main1180 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        int N = ler.nextInt();
        int min = 0, pos = 0;

        if(N >= 1 && N <= 1000){
            int[] X = new int[N];
            for(int i = 0; i < N; i++){
                X[i] = ler.nextInt();
                if(i == 0){
                    min = X[i];
                    pos = i;
                }else if(X[i] < min){
                    min = X[i];
                    pos = i;
                }
            }
            System.out.println("Menor valor: " + min);
            System.out.println("Posicao: " + pos);
        }
    }
}
