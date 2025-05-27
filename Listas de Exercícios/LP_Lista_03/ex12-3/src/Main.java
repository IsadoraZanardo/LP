import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os números separados por espaço: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        System.out.println( "---------------" +
                            "\nMENU" +
                            "\n---------------" +
                            "\n1. Soma" +
                            "\n2. Subtracao" +
                            "\n3. Multiplicacao" +
                            "\n4. Divisao" +
                            "\n");

        int option = in.nextInt();

        switch (option){
            case 1:
                result = n1+n2;
                System.out.println("A soma é: " + n1 + " + " + n2 + " = " + result);
                break;

            case 2:
                result = n1-n2;
                System.out.println("A subtração é: " + n1 + " - " + n2 + " = " + result);
                break;

            case 3:
                result = n1*n2;
                System.out.println("A multiplicação é: " + n1 + " x " + n2 + " = " + result);
                break;

            case 4:
                result = n1/n2;
                System.out.println("A divisão é: " + n1 + " / " + n2 + " = " + result);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}