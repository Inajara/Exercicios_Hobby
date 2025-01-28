import java.io.IOException;
import java.util.Scanner;

public class Main2344 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int nota = ler.nextInt();

        if(nota == 0){
            System.out.println("E");
        }else if(nota >= 1 && nota <= 35){
            System.out.println("D");
        }else if(nota >= 36 && nota <= 60){
            System.out.println("C");
        }else if(nota >= 61 && nota <= 85){
            System.out.println("B");
        }else if(nota >= 86 && nota <= 100){
            System.out.println("A");
        }
    }
}
