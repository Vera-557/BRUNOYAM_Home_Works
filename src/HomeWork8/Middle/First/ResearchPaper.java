package HomeWork8.Middle.First;

public class ResearchPaper extends Material{
    private final String researchField;
    private final String institution;
    private final int pages;

    public ResearchPaper(String id, String title, String researchField,
                         String institution, int pages) {
        super(id, title);
        this.researchField = researchField;
        this.institution = institution;
        this.pages = pages;
    }

    @Override
    public String getType() {
        return "Научный труд";
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Область: %s, Учреждение: %s, Страниц: %d",
                researchField, institution, pages);
    }
}
