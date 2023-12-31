import java.util.Scanner;

public class CreateMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < r;i++){
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length;i++) {
            for(int j=0; j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}