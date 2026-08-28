package Tag13_Uberladung;

public class CreatePerson {
    int alter;
    String name;
    String telefon;

    public CreatePerson(int alter,String name){
        this.alter = alter;
        this.name = name;
        this.telefon = "";
    }
    public CreatePerson(int alter,String name, String telefon){
        this.alter = alter;
        this.name = name;
        this.telefon = telefon;
    }


}
