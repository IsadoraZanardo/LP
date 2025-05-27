import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            n = in.nextLong();

        } while (n<=0); //fica repetindo até user digitar um número maior que zero
        System.out.println("Sum is: " + sumNumbers(n)); //mudar AQUI opção 1 ou 2
    }


    public static long sumNumbers (long n) {
        long sum = 0;

        for (long i=n; i>0; i--) { // i começa com o mesmo valor de n
            sum += i;
        }
        return sum;
    }

}