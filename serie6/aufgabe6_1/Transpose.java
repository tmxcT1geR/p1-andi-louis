// Louis Kruysse 19-123-041
// Andreas Dobler 19-105-238
// P1 Übungsserie 6 Aufgabe 6-1

package aufgabe6_1;

public class Transpose {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};

        Matrix.print(A, "A");
        Matrix.print(Matrix.transpose(A), "At");
    }
}
