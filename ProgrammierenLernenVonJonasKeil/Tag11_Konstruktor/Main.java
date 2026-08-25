package Tag11_Konstruktor;

public class Main {
    public static void main(String[] args){
        KonstruktorHund pavelMops = new KonstruktorHund(12, "Pavel", "Mops", true);
        KonstruktorHund katyaLaprador = new KonstruktorHund(4, "Katya", "Laprador", false);

        KonstruktorHund[] hunde = {pavelMops,katyaLaprador};
        int counterPfote = 0;
        int counterHunde = 1;
        System.out.println("Wie viel Hunde können Pfote geben?");
        for (int i = 0; i < hunde.length; i++){
            if (hunde[i].kannPfoteGeben){
                counterPfote++;
            }
        }
        System.out.println(counterPfote + " Hund(e) können Pfote geben");


        System.out.println("Wie heißen Sie?");

        for (int i = 0; i < hunde.length; i++){
            System.out.println(counterHunde + " " + hunde[i].name);
            counterHunde++;
        }

    }



}
