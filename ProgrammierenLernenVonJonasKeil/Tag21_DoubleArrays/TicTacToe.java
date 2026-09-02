package Tag21_DoubleArrays;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        TicTacToe game = new TicTacToe();
        String[][] gameMatrix = game.startBoard();
        boolean gameStatus = !(game.isWinner(gameMatrix));
        game.drawBoard(gameMatrix);
        //game.choosePick(gameMatrix);
        while (gameStatus){

        }

    }

    public String[][] startBoard(){
        String[][] matrix = new String[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = "\u25FB";
            }
        }
        return matrix;
    }

    public void drawBoard(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int[] choosePick(String[][] matrix){
        Scanner scan = new Scanner(System.in);
        int[] array = new int[2];
        System.out.println("Enter the number  to choose the string (1 , 2 , 3)");
        array[0] = scan.nextInt();

        for (int j = 0; j < matrix.length; j++) {
            matrix[array[0] - 1][j] = "\uD83D\uDFE9";
        }
        drawBoard(matrix);

        for (int j = 0; j < matrix[array[0] - 1].length; j++) {
            matrix[array[0] - 1][j] = "\u25FB";
        }

        System.out.println("Enter the number to choose the row (1 , 2 , 3)");

        array[1] = scan.nextInt();
        matrix[array[0]-1][array[1]-1] = "\uD83D\uDFE9";
        drawBoard(matrix);

        return array;
    }
    public boolean isWinner(String[][] matrix){
        String point;
        boolean flagStatus = false;

        // - - -
        // y y y
        // y y y
        point = matrix[0][0];
        switch (point){
            case "x", "o":
                loop: for (int j = 1; j < matrix.length; j++) {
                    if (matrix[0][j].equals(point)){
                        flagStatus = true;
                        continue loop;
                    } else {
                        flagStatus = false;
                        break loop;
                    }
                    
                    
                }
                break;
            case "\u25FB":
                flagStatus = false;
                break;

            default:
                break;
        }
        if (flagStatus == true){
            return true;
        }


        // y y y
        // - - -
        // y y y
        point = matrix[1][0];
        switch (point){
            case "x", "o":
                loop: for (int j = 1; j < matrix.length; j++) {
                    if (matrix[1][j].equals(point)){
                        flagStatus = true;
                        continue loop;
                    } else {
                        flagStatus = false;
                        break loop;
                    }


                }
                break;
            case "\u25FB":
                flagStatus = false;
                break;

            default:
                break;
        }
        if (flagStatus == true){
            return true;
        }
        // y y y
        // y y y
        // - - -
        point = matrix[2][0];
        switch (point){
            case "x", "o":
                loop: for (int j = 1; j < matrix.length; j++) {
                    if (matrix[2][j].equals(point)){
                        flagStatus = true;
                        continue loop;
                    } else {
                        flagStatus = false;
                        break loop;
                    }


                }
                break;
            case "\u25FB":
                flagStatus = false;
                break;

            default:
                break;
        }
        if (flagStatus == true){
            return true;
        }

        // - y y
        // y - y
        // y y -
        point = matrix[0][0];
        switch (point){
            case "x", "o":
                flagStatus = matrix[1][1].equals(point) && matrix[2][2].equals(point);
                break;
            case "\u25FB":
                flagStatus = false;
                break;

            default:
                break;
        }
        if (flagStatus == true){
            return true;
        }
        // y y -
        // y - y
        // - y y
        point = matrix[2][0];
        switch (point){
            case "x", "o":
                flagStatus = matrix[1][1].equals(point) && matrix[0][2].equals(point);
                break;
            case "\u25FB":
                flagStatus = false;
                break;

            default:
                break;
        }
        if (flagStatus == true){
            return true;
        } else {
            return false;
        }
    }

}

