import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o menor número: ");
        int n1 = in.nextInt();

        System.out.println("Digite o maior número: ");
        int n2 = in.nextInt();

        for(int i=n1+1; i<n2; i++) {
            if (i>0) {
                System.out.println(i);
            }
        }
    }
}