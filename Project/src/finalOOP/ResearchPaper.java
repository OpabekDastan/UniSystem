package finalOOP;

public class ResearchPaper {
    private int dateOfPublication;
    private int articleLength;
    private String citations;
    private String title;
    private Researcher author;

    public ResearchPaper(String title, int dateOfPublication, int articleLength, String citations, Researcher author) {
        this.title = title;
        this.dateOfPublication = dateOfPublication;
        this.articleLength = articleLength;
        this.citations = citations;
        this.author = author;
    }

    public String getCitation() {
        return citations;
    }
}