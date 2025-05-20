import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            n = in.nextInt();

        } while (n<=0);
        System.out.println("Sum is: " + sumNumbers(n)); //mudar AQUI opção 1 ou 2
    }

    // PRIMEIRA OPÇÃO
    public static int sumNumbers (int n) {
        int sum = 0;

        for (int i=n; i>0; i--) { // i começa com o mesmo valor de n
            sum += i;
        }
        return sum;
    }

    // SEGUNDA OPÇÃO
    public static int sumNumbers2 (int n) {
        if(n==1)
            return 1;
        return n + sumNumbers2(n-1);
    }

}