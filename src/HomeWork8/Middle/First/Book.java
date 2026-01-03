package HomeWork8.Middle.First;

public class Book extends Material{
    private final String author;
    private final int year;

    public Book(String id, String title, String author, int year) {
        super(id, title);
        this.author = author;
        this.year = year;
    }

    @Override
    public String getType() {
        return "Книга";
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Автор: %s, Год: %d", author, year);
    }
}
