package HomeWork10.Middle.Autopark;

public class Zhiguli extends Auto{
   private Zhiguli(String name, int madeInYear, double running, double ratio) {
        super(name, madeInYear, running, ratio);
    }
    public Zhiguli(String name, int madeInYear, double running) {
        this(name, madeInYear, running, 1);
    }
}
