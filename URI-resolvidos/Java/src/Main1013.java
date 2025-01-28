import java.io.IOException;
import java.util.Scanner;

public class Main1013 {
    public static void main(String[] args) throws IOException {

        Scanner x = new Scanner(System.in);

        int a = x.nextInt();
        int b = x.nextInt();
        int c = x.nextInt();

        int mab = (a + b + Math.abs(a - b)) / 2;
        int mbc = (mab + c + Math.abs(mab - c)) / 2;

        System.out.printf((mbc) + " eh o maior\n");
    }
}
