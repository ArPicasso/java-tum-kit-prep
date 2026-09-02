package Tag21_DoubleArrays;

public class MainEinmaleins {
    public static void main ( String[] args){
        String[][] einmaleins = new String[10][10];
        for (int i = 0; i < einmaleins.length; i++) {
            for (int j = 0; j < einmaleins.length; j++) {
                einmaleins[i][j] = (i + 1) + " x " + (j+1) + " = " + (i + 1)*(j+1) + "\t";
            }
        }
        for (int i = 0; i < einmaleins.length; i++) {
            for (int j = 0; j < einmaleins.length; j++) {
                System.out.print(einmaleins[i][j]);
            }
            System.out.println();
        }
    }
}
