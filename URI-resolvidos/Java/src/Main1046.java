import java.io.IOException;
import java.util.Scanner;

public class Main1046 {
    public static void main(String[] args) throws IOException {

        int ini, fin;
        Scanner ler = new Scanner(System.in);
        ini = ler.nextInt();
        fin = ler.nextInt();
        int time = fin - ini;

        if (time < 0){
            time = 24 + (fin - ini);
        }if (ini == fin){
            System.out.printf("O JOGO DUROU 24 HORA(S)\n");
        }else {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", (time));
        }
    }
}
