import java.io.IOException;
import java.util.Scanner;

public class Main1038 {
    public static void main(String[] args) throws IOException {
        Scanner n = new Scanner(System.in);

        int codigo = n.nextInt();
        int qtde = n.nextInt();
        double total = 0;

        switch (codigo){
            case 1:
                total = qtde*4.00;
                break;
            case 2:
                total = qtde*4.50;
                break;
            case 3:
                total = qtde*5.00;
                break;
            case 4:
                total = qtde*2.00;
                break;
            case 5:
                total = qtde*1.50;
                break;
        }

        System.out.println(String.format("Total: R$ %.2f", total));
    }
}
