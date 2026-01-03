package HomeWork8.Middle.First;

public class Magazine extends Material{
    private final int issueNumber;
    private final String publisher;

    public Magazine(String id, String title, int issueNumber, String publisher) {
        super(id, title);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    @Override
    public String getType() {
        return "Журнал";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" №%d, Издатель: %s", issueNumber, publisher);
    }
}