package HomeWork10.Middle.Autopark;

public class Porsсhe extends Auto{
   private Porsсhe(String name, int madeInYear, double running, double ratio) {
        super(name, madeInYear, running, ratio);
    }
    public Porsсhe(String name, int madeInYear, double running) {
        this(name, madeInYear, running, 10);
    }
}
