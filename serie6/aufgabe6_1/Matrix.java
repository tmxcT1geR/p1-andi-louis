// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 6 Aufgabe 6-1

package aufgabe6_1;

import java.util.Random;

public class Matrix {

    public static int[][] transpose (int[][] A){
        int m = A.length;
        // anzahl arrays
        int n = A[0].length;
        // anzahl elemente im ersten array
        int[][] At = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                At[j][i] = A[i][j];
            }
        }
        return At;
    }

    public static int[][] product (int[][] A, int[][] B){
        int m = A.length;
        int n = B[0].length;
        int [][] C = new int[m][n];

        int[][] Bt = transpose(B);

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int k = A[0].length;
                int sum = 0;
                for(int l = 0; l < k; l++){
                    sum += A[i][l] * Bt[j][l];
                }
                C[i][j] = sum;
            }
        }
        return C;
    }

    public static void print ( int[][] A, String name){
        System.out.println(name + ":");

        for (int[] line : A) {
            for (int bar : line) System.out.print("," + bar);
            System.out.println();
        }

        System.out.println();
    }

    //um Matrix zu testen
    public static void main(String[] args) {

        Random rnd = new Random();
        int m = 4;
        int n = 3;
        int[][] A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = rnd.nextInt(10);
            }
        }

        int k = 1;
        int[][] B = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                B[i][j] = rnd.nextInt(10);
            }
        }

        int[][] At = transpose(A);
        int[][] C = product(A, B);
    }
}
