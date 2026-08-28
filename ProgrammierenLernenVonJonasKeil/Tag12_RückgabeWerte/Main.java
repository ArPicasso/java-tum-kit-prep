package Tag12_RückgabeWerte;

public class Main {
    public static void main (String[] args){
        Taschenrechner rechner = new Taschenrechner();
        // (35 * 4 - 123 + 40)/3
        int produkt = rechner.multiplizieren(35,4);
        int substraktion = rechner.substrahieren(produkt , 123);
        int addieren = rechner.addieren(substraktion, 40);
        double diviideren = rechner.dividieren(addieren,3);

        System.out.println(diviideren);



    }
}
