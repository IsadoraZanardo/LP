public class Main {
    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3, 8, 5},
                          {2, 3, 4, 5, 1},
                          {3, 4, 5, 1, 2},
                          {4, 5, 1, 2, 3},
                          {5, 1, 2, 3, 4}};

        for (int i=0; i<matrix.length; i++) {
            System.out.println(matrix[i][matrix.length-1-i]);

            //MATRIZ NORMAL
            //System.out.println(matrix[i][i]); --> [i][i] pega o mesmo ínidce da coluna e da linha (ex: 00, 11, 22...)

            //MATRIZ INVERTIDA
            //System.out.println(matrix[i][matrix.length-1-i]); --> [i] é a linha
        }
    }
}