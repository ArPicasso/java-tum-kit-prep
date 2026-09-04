package ClaudeKurs;

public class Aufgabe1 {
    public static int diagonalSum(int[][] matrix){
        int diogonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            diogonalSum += matrix[i][i];
        }
        return diogonalSum;
    }
}
