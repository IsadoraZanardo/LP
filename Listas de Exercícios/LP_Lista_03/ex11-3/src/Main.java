import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your number: ");
        num = in.nextDouble();

        if(num==1)
            System.out.println("Sunday");
        else if (num==2)
            System.out.println("Monday");
        else if (num==3)
            System.out.println("Tuesday");
        else if (num==4)
            System.out.println("Wednesday");
        else if (num==5)
            System.out.println("Thursday");
        else if (num==6)
            System.out.println("Friday");
        else if (num==7)
            System.out.println("Saturday");
        else
            System.out.println("Error");
    }
}