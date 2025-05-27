import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter your number: ");
            n = in.nextInt();

        } while (n<=0); //fica repetindo até user digitar um número maior que zero
        System.out.println("Factorial is: " + factorialNumbers(n));
    }


    public static int factorialNumbers (int n) {
        int factorial = 1; //não pode inicializar com zero pq é uma multiplicação

        for (int i=n; i>1; i--) { //i começa com o mesmo valor de n
            factorial *= i; //factorial = fatorial * i
        }
        return factorial;
    }

}