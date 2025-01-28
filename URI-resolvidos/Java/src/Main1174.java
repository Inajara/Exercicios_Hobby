import java.io.IOException;
import java.util.Scanner;

public class Main1174 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        double [] A = new double [100];

        for(int i = 0; i < A.length; i++){
            A[i] = ler.nextDouble();
            if(A[i] <= 10){
                System.out.println("A[" + i + "] = " + A[i]);
            }
        }
    }
}
