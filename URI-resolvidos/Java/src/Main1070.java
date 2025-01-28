import java.io.IOException;
import java.util.Scanner;

public class Main1070 {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();
        int y = 0;
        for(int i = 0; i < 12; i++){
            y = x ++;
            if(y % 2 != 0){
                System.out.println(y);
            }
        }
    }
}
