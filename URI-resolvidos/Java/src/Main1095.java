import java.io.IOException;

public class Main1095 {
    public static void main(String[] args) throws IOException {

        int i = 1;
        int j = 60;
        System.out.println("I=" + i + " J=" + j);
        while(j != 0){
            i = i + 3;
            j = j - 5;
            System.out.println("I=" + i + " J=" + j);
        }
    }
}
