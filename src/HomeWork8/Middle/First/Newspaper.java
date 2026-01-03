package HomeWork8.Middle.First;

public class Newspaper extends Material{
    private final String editor;

    public Newspaper(String id, String title,  String editor) {
        super(id, title);
        this.editor = editor;
    }

    @Override
    public String getType() {
        return "Газета";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Дата: %s, Редактор: %s", editor);
    }

}
