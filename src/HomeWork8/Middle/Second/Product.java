package HomeWork8.Middle.Second;

public abstract class Product {
   private final String name;
   private int volume;

    public Product(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    public Product(int volume) {
        this("String name", volume);
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Продукт - " +name + ", объём " + volume;
    }
}
