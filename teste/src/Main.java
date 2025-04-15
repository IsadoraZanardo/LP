public class Main {
    public static void main(String[] args) {

        //VETOR
        int [] numbers1 = new int [5]; //sem inicialização
        numbers1[0] = 0;
        numbers1[1] = 6;
        numbers1[2] = 5;
        numbers1[3] = 2;
        numbers1[4] = 1;

        int [] numbers2 = {0, 6, 5, 2, 1}; //com inicialização

        int [] desafio1 = {0, 1, 2, 3, 4}; //desafio
        for(int i=0; i<=4.; i++){ //i é igual a 0; enquanto i for <= 4. adicione um número a mais
            System.out.println(desafio1[i]);
        }

        //MATRIZ
        int [][] matriz1 = new int[2][2]; //sem inicialização

        int [][] matriz2 = {{5, 8, 9}, //com inicialização
                            {9, 6, 5},
                            {2, 3, 4}};
        System.out.println(matriz2[1][2]);

        int [][] desafio2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}}; //desafio
        for(int i=0; i<desafio2.length; i++){
            for(int j=0;j<desafio2[0].length;j++) {
                System.out.print(desafio2[i][j] + " ");
            }
                System.out.print("\n");
            }
        }

    }
