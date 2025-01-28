import java.io.IOException;
import java.util.Scanner;

public class Main1049 {
    public static void main(String[] args) throws IOException {

        String p1, p2, p3;
        Scanner ler = new Scanner(System.in);
        p1 = ler.next();
        p2 = ler.next();
        p3 = ler.next();

        if(p1.equalsIgnoreCase("vertebrado")) {
            if(p2.equalsIgnoreCase("ave")) {
                if(p3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else{
                    System.out.println("pomba");
                }
            }else{
                if(p3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(p2.equalsIgnoreCase("inseto")) {
                if(p3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if(p3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}
