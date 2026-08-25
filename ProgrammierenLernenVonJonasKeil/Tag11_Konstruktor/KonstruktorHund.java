package Tag11_Konstruktor;

public class KonstruktorHund {

    int alter;
    String name;
    String art;
    boolean kannPfoteGeben;

    //Konstruktor
    public KonstruktorHund  (int alter, String name, String art, boolean kannPfoteGeben){
            this.alter = alter;
            this.name = name;
            this.art = art;
            this.kannPfoteGeben = kannPfoteGeben;
    }

    public void bellen(String name){
            System.out.println("Wuff, ich bin " + name + " !");
        }


}
