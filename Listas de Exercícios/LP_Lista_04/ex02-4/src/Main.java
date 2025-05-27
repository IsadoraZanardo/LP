import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //OPÇÃO 1
        int maior1=0, menor1=0;

        Scanner in = new Scanner(System.in);

        for(int i=1; i<=5; i++) { //++ é sempre +1
            System.out.println("Digite o " + i + " número: ");
            int temp = in.nextInt();

            if (i == 1) {
                maior1 = temp;
                menor1 = temp;
            }

            if (temp > maior1)
                maior1 = temp;

            if (temp < menor1)
                menor1 = temp;

            }

        System.out.println("\nMaior: " + maior1);
        System.out.println("Menor: " + menor1 + "\n");



        //OPÇÃO 2
        int maior2=Integer.MIN_VALUE ,menor2=Integer.MAX_VALUE;

        Scanner in2 = new Scanner(System.in);

        for(int i=1; i<=5; i++) { //++ é sempre +1
            System.out.println("Digite o " + i + " número: ");
            int temp = in.nextInt();


            if (temp > maior2)
                maior2 = temp;

            if (temp < menor2)
                menor2 = temp;

        }

        System.out.println("\nMaior: " + maior2);
        System.out.println("Menor: " + menor2);

    }
}