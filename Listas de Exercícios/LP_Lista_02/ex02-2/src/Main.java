import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, result;

        System.out.println("Digite um núemro: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        number = in.nextInt();

        result = number * number;
        System.out.println("O quadrado de " + number + " é: " + (number*number));
    }
}