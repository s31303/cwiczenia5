import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> studentList = new ArrayList<>();

    public static void addStudent(Student student) {
        studentList.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : studentList) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : studentList) {
            System.out.println("Index: " + student.getIndexNumber() +
                    ", imię: " + student.getFirstName() + " " + student.getLastName() +
                    ", Email: " + student.getEmail() +
                    ", Adres zamieszkania: " + student.getAddress() +
                    ", Data urodzenia: " + student.getBirthDate() +
                    ", Status: " + student.getStatus() +
                    ", Aktualny semestr: " + student.getCurrentSemester());
        }
    }
}
