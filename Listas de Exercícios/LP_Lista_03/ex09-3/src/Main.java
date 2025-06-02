import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 3 sides for triangle: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (a+b>c && a+c>b && b+c>a) {
            System.out.print("It is...");

            if (a==b && b==c)
                System.out.println(" equilateral"); //3 lados iguais

            else if (a==b || a==c || b==c)
                System.out.println(" isosceles"); //2 lados iguais

            else
                System.out.println(" scalene"); //0 lados iguais
        }

        else
            System.out.println("Not possible to draw a triangle");

        in.close();
    }
}
