package finalOOP;
import java.util.*;

public class ResearchProject {
    private String title;
    private List<ResearchPaper> publishedPapers = new ArrayList<>();
    private List<Researcher> projectParticipants = new ArrayList<>();

    public void addParticipant(Researcher researcher) {
        projectParticipants.add(researcher);
    }

    public void addPublishedPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }
}