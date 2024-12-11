package finalOOP;

import java.util.ArrayList;
import java.util.List;

public class DatabaseCollections {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Courses> courses = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();

    // Геттеры для доступа к данным
    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
}
