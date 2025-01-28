import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1040 {
    public static void main(String[] args) throws IOException {

        double n1, n2, n3, n4;
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        n3 = ler.nextDouble();
        n4 = ler.nextDouble();
        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.println("Media: " + df.format(media));

        if(media >= 7){
            System.out.println("Aluno aprovado.");
        }else if(media >= 5 && media < 7){
            System.out.println("Aluno em exame.");
            double nr = ler.nextDouble();
            double mrec = (media + nr) / 2;
            System.out.println("Nota do exame: " + df.format(nr));
            if(mrec >= 5){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + df.format(mrec));
        }else if(media < 5){
            System.out.println("Aluno reprovado.");
        }
    }
}
