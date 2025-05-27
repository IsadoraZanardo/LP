import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite os 3 lados do triângulo separados por espaço:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("Os valores formam um triângulo...");

            if (a==b && b==c)
                System.out.println("Equilátero"); //3 lados iguais
            else if (a==b || a==c || b==c)
                System.out.println("Isósceles"); //2 lados iguais
            else
                System.out.println("Escaleno"); //0 lados iguais
        }

        else
            System.out.println("Os valores não formam um triângulo.");

        in.close();
    }
}
