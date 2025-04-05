import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;
        int option;

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
                            "\n4. Divisao") ;

        option = in.nextInt();

        switch (option){
            case 1:
                result = n1+n2;
                System.out.println(n1 + " + " + n2 );
                break;
            case 2:
                result = n1-n2;
                System.out.println("A subtração é: ");
                break;
            case 3:
                result = n1*n2;
                System.out.println("A multiplicação é: ");
                break;
            case 4:
                result = n1/n2;
                System.out.println("A divisão é: ");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}