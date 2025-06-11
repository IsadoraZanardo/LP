import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, factorial;
        factorial = 1;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        n = in.nextInt();

        for (int i=1; i<=n; i++) {
        factorial*=i; }

        System.out.println(factorial);
    }
}