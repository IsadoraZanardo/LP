import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value1, value2;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("------------------------------\n" +
                "Menu:\n" +
                "    1. Círculo\n" +
                "    2. Triangulo Retângulo\n" +
                "    3. Retângulo\n" +
                "------------------------------\n");
        System.out.println("Insira uma figura geométrica: ");
        option = in.nextInt();

        System.out.println("Informe a base/raio: ");
        value1 = in.nextDouble();

        System.out.println("Informe a altura: ");
        value2 = in.nextDouble();

        switch (option) {
            case 1:
                System.out.println("ÁREA: " + Math.PI*Math.pow(value1, 2));
                System.out.println("PERÍMETRO: " + 2*Math.PI*value1);
                break;

            case 2:
                double hipotenusa = Math.sqrt(Math.pow(value1, 2) + Math.pow(value2, 2));
                System.out.println("ÁREA: " + (value1 * value1) / 2);
                System.out.println("PERÍMETRO: " + value1 + value2 + hipotenusa);
                break;

            case 3:
                System.out.println("ÁREA: " + value1 * value1);
                System.out.println("PERÍMETRO: " + value1 + value1 + value2 + value2);
                break;
        }
    }
}