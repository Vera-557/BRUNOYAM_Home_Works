package HomeWork8.Middle.First;


public abstract class Material {
    private final String id;
    private final String title;
    private boolean isAvailable;

    public Material(String id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public abstract String getType();

    @Override
    public String toString() {
        return String.format("[%s] %s - %s (%s)",
                id, getType(), title, isAvailable ? "Доступно" : "Выдано");
    }
}
