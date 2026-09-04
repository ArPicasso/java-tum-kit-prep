package ClaudeKurs;

public class Warehouse {
    private String[][] shelves;

    public Warehouse (int row, int col){
        if (row < 0 || col < 0){
            System.out.println("Не удалось создать shelves");
            this.shelves = new String[0][0];
            return;
        }
        this.shelves = new String[row][col];

    }

    public void set(int row, int col, String itemCode){
        if (row >= 0 && col >= 0 && shelves.length > row && shelves[0].length > col) {
            shelves[row][col] = itemCode;

        } else{
            System.out.println("set error...");
        }

    }
    public String get(int row, int col){
        if (row >= 0 && col >= 0 && shelves.length > row && shelves[row].length > col) {
            return shelves[row][col];
        }
        System.out.println("get error...");
        return null;
    }

    public void print(){
        for (int i = 0; i < shelves.length; i++) {
            for (int j = 0; j < shelves[i].length; j++) {
                switch (shelves[i][j]){
                    case null :
                        System.out.print(" - " + "\t");
                        break;
                    default:
                        System.out.print(shelves[i][j] + " ");
                        break;
                }

            }
            System.out.println();
        }
    }
    public boolean isLineFull(int startRow, int startCol, int stepRow, int stepCol){
        int counter = 0;
        loop: for (int i = startRow; i < shelves.length; i+=stepRow) {
            for (int j = startCol; j < shelves[i].length; j+=stepCol) {
                counter++;
                System.out.println( i + " " + j);
                if (counter == 3){
                    break loop;
                }
            }
        }
        return true;
    }
}
