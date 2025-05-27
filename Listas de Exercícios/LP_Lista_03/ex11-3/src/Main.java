import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu número: ");
        num = in.nextDouble();

        if(num==1)
            System.out.println("Domingo");
        else if (num==2)
            System.out.println("Segunda");
        else if (num==3)
            System.out.println("Terça");
        else if (num==4)
            System.out.println("Quarta");
        else if (num==5)
            System.out.println("Quinta");
        else if (num==6)
            System.out.println("Sexta");
        else
            System.out.println("Sábado");
    }
}