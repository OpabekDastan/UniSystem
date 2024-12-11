package finalOOP;

public class Transcript {
    private Courses courseName;
    private double grades;
    private double firstAtt;
    private double secondAtt;
    private double finalExam;

    public Transcript(Courses courseName, double grades, double firstAtt, double secondAtt, double finalExam) {
        this.courseName = courseName;
        this.grades = grades;
        this.firstAtt = firstAtt;
        this.secondAtt = secondAtt;
        this.finalExam = finalExam;
    }

    public double calculateGPAforCourse() {
        return (firstAtt + secondAtt + finalExam) / 3;
    }
    public String calculateLetterMark() {
        if (grades >= 90) return "A";
        if (grades >= 80) return "B";
        if (grades >= 70) return "C";
        if (grades >= 60) return "D";
        return "F";
    }
}