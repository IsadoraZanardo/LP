import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result;
        char option;
        boolean error = false; // BOOLEAN armazena TRUE ou FALSE

        Scanner in = new Scanner(System.in);

        do{
            error = false;
            for (int i=1; i<=10; i++){
                for (int j=0; j<=10; j++){
                    System.out.println(i + " x "+ j + " = ");
                    result = in.nextInt();
                    if (result != (i*j)){
                        error = true;
                        System.out.println("GAME OVER!");
                        break;
                    }
                }
                if (error)
                    break;
                System.out.println("-------------------------");

            }

            if (!error) // (erro)=true (!erro)=false (se erro true, a pessoa errou)
                System.out.println("YOU WIN!");
            System.out.println("\nPlay again? \nYes (Y)\nNo (N)");
            option = in.next().charAt(0); // Lê só o primeiro caractere e já entende a opção selecionada

        }while(option == 's' || option=='S'); // Aceitar letras maiúsculas e minúsculas
        System.out.println("TKS 4 PLAYING :)");
    }
}