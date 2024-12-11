package finalOOP;
import java.util.*;



public class Researcher extends User implements Reasearchable, Supervisorable {
	 private List<ResearchProject> researchProjects = new ArrayList<>();
	 private List<ResearchPaper> researchPapers = new ArrayList<>();

	 public Researcher(String email, String password, String id, String firstName, String lastName) {
	     super(email, password, id, firstName, lastName);
	 }

	 public void doResearch() {
	     // Implementation for conducting research
	 }

	 public void becomeSupervisor() {
	     // Implementation for becoming a supervisor
	 }

	 public void printPapers() {
	     for (ResearchPaper paper : researchPapers) {
	         System.out.println(paper.getCitation());
	     }
	 }

	 public int calculateHIndex() {
	     return researchPapers.size();
	 }
	}
