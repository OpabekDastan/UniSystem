package finalOOP;

import java.util.*;

public class ResearchJournal extends Journal {
    private List<ResearchPaper> articles = new ArrayList<>();

    public void addArticle(ResearchPaper paper) {
        articles.add(paper);
    }
}