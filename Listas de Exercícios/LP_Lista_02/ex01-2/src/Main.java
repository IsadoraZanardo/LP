import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Enter your number: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        number = in.nextInt();

        result = number * 2;
        System.out.println("O dobro de " + number + " é: "+ (number*2));
    }
}