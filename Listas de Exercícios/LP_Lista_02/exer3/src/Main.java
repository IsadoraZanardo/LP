import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result;

        System.out.println("Digite um número real: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        number = in.nextDouble();

        result =number / 5;
        System.out.println("O resultado da quinta parte de " + number + " é: " + number /5);
    }
}