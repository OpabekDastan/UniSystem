package finalOOP;

import java.util.*;

public class Student extends User {
    private String degree;
    private String major;
    private double gpa;
    private int yearOfStudy;
    private List<Courses> courses = new ArrayList<>();

    public Student(String email, String password, String id, String firstName, String lastName,String degree, String major, double gpa, int yearOfStudy) {
        super(email, password, id, firstName, lastName); 
        this.degree = degree;
        this.major = major;
        this.gpa = gpa;
        this.yearOfStudy = yearOfStudy;
    }





	public void viewCourses() {
     
    }

    public void registerForCourses() {
       
    }

    public void viewJournal() {
        
    }
}
