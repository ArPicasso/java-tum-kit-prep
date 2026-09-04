package ClaudeKurs;

public class MainWareHouse {
    public static void main(String[] args){
        Warehouse amazonMatrix = new Warehouse(3,3);
        amazonMatrix.set(0,1, "Варенник");
        amazonMatrix.set(0,2, "Варенник2");
        //System.out.println(amazonMatrix.get(3,4));
        System.out.println("-------------");
        //amazonMatrix.print();
        amazonMatrix.isLineFull(0,0,1,1);
    }
}
