package finalOOP;

public class Teacher extends Employee {
    private TeacherType type;
    private Courses course;

    public Teacher(String email, String password, String id, String firstName, String lastName,double salary, int yearOfJoin, TeacherType type,Courses course) {
    	super(email, password, id, firstName, lastName, salary, yearOfJoin); 
        this.type = type;
        this.course = course;
        
    }

    public void sendComplaint() {
    }
    public void viewCourse() {
    }
    public void manageCourse() {
    }
    public void viewStudents() {
    }
    public void markStudents() {
    }
}
