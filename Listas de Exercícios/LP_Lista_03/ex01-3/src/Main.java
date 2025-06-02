import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n, sqrt;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        n = in.nextDouble();

        if (n>=0) {
            sqrt = Math.sqrt(n);
            System.out.println("Square root of " + n + " is: " + sqrt);
        } else
            System.out.println("There is no real square root for " + n);
    }
}