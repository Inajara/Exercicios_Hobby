import java.io.IOException;
import java.util.Scanner;

public class Main1047 {
    public static void main(String[] args) throws IOException {

        int ini, fin, ini2, fin2;
        Scanner ler = new Scanner(System.in);
        ini = ler.nextInt();
        ini2 = ler.nextInt();
        fin = ler.nextInt();
        fin2 = ler.nextInt();
        int time = (ini * 60) + ini2;
        int time2 = (fin * 60) + fin2;
        int h24 = (24 * 60);
        int res = 0;

        if(time2 > time){
            res = time2 - time;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (res / 60), (res % 60));
        }else if(time > time2){
            res = (h24 - time) + (time2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (res / 60), (res % 60));
        }else if(time2 == time){
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", 24, 0);
        }
    }
}
