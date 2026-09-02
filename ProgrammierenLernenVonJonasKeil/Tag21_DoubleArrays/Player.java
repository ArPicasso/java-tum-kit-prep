package Tag21_DoubleArrays;
import java.util.Arrays;
public class Player{
    String playerSide;
    TicTacToe tic = new TicTacToe();
    public Player (String playerSide){
        this.playerSide = playerSide;
    }
    public String[][]  makeZug(String[][] matrix){
        int[] pos =  tic.choosePick(matrix);
        //System.out.println("позиция: "+ Arrays.toString(pos));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (pos[0]  == i & pos[1] == j){
                    matrix[i][j] = playerSide;
                }
            }
        }
        return matrix;
    }

}
