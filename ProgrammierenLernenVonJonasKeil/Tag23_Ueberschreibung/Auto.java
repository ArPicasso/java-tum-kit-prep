package Tag23_Ueberschreibung;

public class Auto extends Fahrzeug{
    int geschwindigkeit;

    @Override
    public void fahren(){
        System.out.println("Brum....");
    }
    @Override
    public int getGeschwindigkeit(){
        return geschwindigkeit;
    }
}
