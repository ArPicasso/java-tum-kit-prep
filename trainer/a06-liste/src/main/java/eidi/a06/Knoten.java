package eidi.a06;

// Diese Klasse ist fertig. Bitte nicht verändern.
public class Knoten {

    public int info;
    public Knoten next;

    public Knoten(int info, Knoten next) {
        this.info = info;
        this.next = next;
    }

    public Knoten(int info) {
        this(info, null);
    }
}
