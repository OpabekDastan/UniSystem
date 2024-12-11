package finalOOP;

public class Admin extends Employee {
    private DatabaseCollections database; 

    public Admin(String email, String password, String id, String firstName, String lastName, double salary, int yearOfJoin, DatabaseCollections database) {
        super(email, password, id, firstName, lastName, salary, yearOfJoin);
        this.database = database; 
    }

   
    public void addUser(User user) {
        if (user instanceof Student) {
            database.getStudents().add((Student) user); 
        } else if (user instanceof Teacher) {
            database.getTeachers().add((Teacher) user); 
        } else {
            throw new IllegalArgumentException("Неверный тип пользователя");
        }
    }

 
    public void createStudent(String email, String password, String id, String firstName, String lastName, String degree, String major, double gpa, int yearOfStudy) {
        Student newStudent = new Student(email, password, id, firstName, lastName, degree, major, gpa, yearOfStudy);
        addUser(newStudent); 
    }


    
    public void createTeacher(String email, String password, String id, String firstName, String lastName, double salary, int yearOfJoin, TeacherType type, Courses course) {
        Teacher newTeacher = new Teacher(email, password, id, firstName, lastName, salary, yearOfJoin, type, course);
        addUser(newTeacher); 
    }

    
    public void removeUser(String userId) {
        database.getStudents().removeIf(student -> student.getId().equals(userId));
        database.getTeachers().removeIf(teacher -> teacher.getId().equals(userId));
    }

    
    public void updateUser(String userId, String newEmail, String newPassword) {
        for (Student student : database.getStudents()) {
            if (student.getId().equals(userId)) {
                student.setEmail(newEmail);
                student.setPassword(newPassword);
                return; 
            }
        }
        for (Teacher teacher : database.getTeachers()) {
            if (teacher.getId().equals(userId)) {
                teacher.setEmail(newEmail);
                teacher.setPassword(newPassword);
                return; 
            }
        }
        System.out.println("Пользователь с ID " + userId + " не найден.");
    }

    
    public void seeLogFiles() {
        System.out.println("Просмотр лог-файлов: функциональность еще не реализована.");
    }
}

