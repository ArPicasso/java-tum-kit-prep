package Tag21_DoubleArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        int counter = 0;
        Player player1 = new Player("x");
        Player player2 = new Player("o");
        TicTacToe game = new TicTacToe();
        String[][] gameMatrix = game.startBoard();
        game.drawBoard(gameMatrix);
        boolean gameStatus;
        //game.choosePick(gameMatrix);
        while (true){

            System.out.println("Player 1, your turn! Choose a string and afterwords row");
            player1.makeZug(gameMatrix);
            game.drawBoard(gameMatrix);
            counter++;

            gameStatus = game.isWinner(gameMatrix);
            //System.out.println("gameStatus: " + gameStatus);
            //System.out.println("Есть ли победитель? " + (gameStatus ? "Да, поздравляем Player 1" : "Нет") );
            if (gameStatus){
                System.out.println("Congratulations, Player 1");
                break;
            }
            System.out.println("Player 2, your turn! Choose a string and afterwords row");
            if (counter == 9){
                System.out.println("Draw!");
            }
            player2.makeZug(gameMatrix);

            game.drawBoard(gameMatrix);
            counter++;
            gameStatus = game.isWinner(gameMatrix);
            //System.out.println("gameStatus: " + gameStatus);
            //System.out.println("Есть ли победитель? " + (gameStatus ? "Да" : "Нет") );
            if (gameStatus){
                System.out.println("Congratulations, Player 2");
                break;
            }
            System.out.println(counter);


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
        //System.out.println("Вход в функцию choosePick");

        //System.out.println("Текушая матрица ");
        //drawBoard(matrix);
        Scanner scan = new Scanner(System.in);
        int[] array = new int[2];
        //System.out.println("Enter the number  to choose the string (1 , 2 , 3)");
        array[0] = scan.nextInt();
        array[0]--;

        //for (int j = 0; j < matrix.length; j++) {
            //if (matrix[array[0]][j].equals("\u25FB")){
                //matrix[array[0]][j] = "\uD83D\uDFE9";
            //}

        //}
        //drawBoard(matrix);

        //for (int j = 0; j < matrix[array[0]].length; j++) {
            //if (!(matrix[array[0]][j].equals("x") || (matrix[array[0]][j].equals("o")))){
                //matrix[array[0]][j] = "\u25FB";
           // }

        //}

        System.out.println("Enter the number to choose the row (1 , 2 , 3)");

        array[1] = scan.nextInt();
        array[1]--;




        //System.out.println(array.equals("\uD83D\uDFE9"));
        //System.out.println(Arrays.toString(array) + matrix[0][0]);
        //System.out.println(array[0] + " " + array[1]);
        //System.out.println(matrix[array[0]][array[1]] + "\uD83D\uDFE9");
        if (matrix[array[0]][array[1]].equals("\u25FB")){
            //drawBoard(matrix);
            System.out.println("U was right!");

            return array;
        } else {
            drawBoard(matrix);
            System.out.println("Place is not free!\nRepeat ur attempt. U can start with a string" );
            return choosePick(matrix);
        }

    }


    public boolean isWinner(String[][] matrix) {
        String point;
        boolean flagStatus = false;
        // - - -
        // p p p
        // y y y
        for (int i = 0; i < 3; i++) {
            point = matrix[i][0];
            switch (point) {
                case "x", "o":
                    loop:
                    for (int j = 1; j < matrix.length; j++) {
                        if (matrix[i][j].equals(point)) {
                            flagStatus = true;

                        } else {
                            flagStatus = false;
                            break loop;
                        }

                    }
                    if (flagStatus){
                        return flagStatus;


                    }
                    break;
                case "\u25FB":
                    break;

                default:
                    break;
            }
        }
        if (flagStatus){
            return flagStatus;
        }
        // - p y
        // - p y
        // - p y
        for (int j = 0; j < 3; j++) {
            point = matrix[0][j];
            switch (point) {
                case "x", "o":
                    loop:
                    for (int k = 1; k < matrix.length; k++) {
                        if (matrix[k][j].equals(point)) {
                                flagStatus = true;
                        } else {
                                flagStatus = false;
                                break loop;
                        }



                    }
                    if (flagStatus){
                        return flagStatus;
                    }
                    break;
                case "\u25FB":
                        break;

                default:
                    break;
                }

        }
        if (flagStatus){
            return flagStatus;
        }
        // - y y
        // y - y
        // y y -
        point = matrix[0][0];
        //System.out.println(matrix[0][0] + matrix[1][1] + matrix[2][2]);
        switch (point) {
            case "x", "o":

                //System.out.println(point);
                flagStatus = matrix[1][1].equals(point) && matrix[2][2].equals(point);
                //System.out.println(flagStatus);
                break;
            case "\u25FB":
                flagStatus = false;
                break;

            default:
                break;
        }
        if (flagStatus){
            return flagStatus;
        }

        // y y -
        // y - y
        // - y y
        point = matrix[2][0];
        switch (point) {
            case "x", "o":
                flagStatus = matrix[1][1].equals(point) && matrix[0][2].equals(point);
                break;
            case "\u25FB":
                flagStatus = false;
                break;

            default:
                break;
        }
        if (flagStatus){
            return flagStatus;
        }

    return flagStatus;
}
}

