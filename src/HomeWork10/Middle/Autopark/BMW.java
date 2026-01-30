package HomeWork10.Middle.Autopark;

public class BMW extends Auto {
    private BMW(String name, int madeInYear, double running, double ratio) {
        super(name, madeInYear, running, ratio);
    }

    public BMW(String name, int madeInYear, double running) {
        this(name, madeInYear, running, 8);
    }
}
