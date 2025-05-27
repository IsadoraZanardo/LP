import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value, total;
        int parcela, option;

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor da compra: ");
        value = in.nextDouble();

        System.out.println("------------------------------\n" +
                "Menu:\n" +
                "    1. Débito\n" +
                "    2. Pix\n" +
                "    3. Crédito\n" +
                "------------------------------\n");
        System.out.println("Escolha uma opção: ");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Débito selecionado");
                System.out.println("Seu desconto é de " + value*0.05 + " reais");
                System.out.println("O novo valor é " + value*0.95 + " reais");
                break;

            case 2:
                System.out.println("Pix selecionado");
                System.out.println("Seu desconto é de " + value*0.1 + " reais");
                System.out.println("O novo valor é " + value*0.9 + " reais");
                break;

            case 3:
                System.out.println("Crédito selecionada\n");

                System.out.println("Em quantas vezes será parcelado?");
                parcela = in.nextInt();

                if (parcela >= 1 && parcela <= 4) {
                    System.out.println("Seu desconto é de " + value*0.02 + " reais");
                    System.out.println("O novo valor é " + value*0.98 + " reais");

                } else if (parcela >= 5 && parcela <= 10) {
                    System.out.println("Seu desconto é de " + value*0.05 + " reais");
                    System.out.println("O novo valor é " + value*0.95 + " reais");

                } else
                    System.out.println("Opçãp inválida");
                break;

            default:
                System.out.println("Opçãp inválida");
                break;
        }
    }
}