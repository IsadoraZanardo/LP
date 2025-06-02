import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double value, change;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("How many reais: ");
        value = in.nextDouble();

        System.out.println("------------------------------\n" +
                "Menu:\n" +
                "    1. Espresso R$ 0,50\n" +
                "    2. Long Coffee R$ 1,00\n" +
                "    3. Capuccino R$ 2,50\n" +
                "    4. Chocolate R$ 2,00\n" +
                "------------------------------\n");
        System.out.println("Choose your option: ");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("ESPRESSO");
                if (value>=0.5) {
                    change = value - 0.5;
                    System.out.println("Money change: R$ " + change);
                }else
                    System.out.println("You don't have enough money");
                break;

            case 2:
                System.out.println("LONG COFFEE");
                if (value>=1) {
                    change = value - 1;
                    System.out.println("Money change: R$ " + change);
                }else
                    System.out.println("You don't have enough money");
                break;

            case 3:
                System.out.println("CAPPUCCINO");
                if (value>=2.5) {
                    change = value - 2.5;
                    System.out.println("Money change: R$ " + change);
                }else
                    System.out.println("You don't have enough money");
                break;

            case 4:
                System.out.println("CHOCOLATE");
                if (value>=2) {
                    change = value - 2;
                    System.out.println("Money change: R$ " + change);
                }else
                    System.out.println("You don't have enough money");
                break;
            default:
                System.out.println("Not valid");
                break;


        }
    }
}