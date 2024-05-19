public class Main {
    public static void main(String[] args) {

    Student s1 = new Student("Maciek", "Kowalski", "M.Kowalski@wp.pl", "Warsaw, Mickiewicza 12", "1999-11-03");

    Students.addStudent(s1);

    StudyProgramme itProgramme = new StudyProgramme("IT", "Program studiów informatycznych", 7, 5);

    s1.enrollStudent(itProgramme);

    s1.addGrade(5, "PGO");
    s1.addGrade(2, "PPZ");

    Students.promoteAllStudents();
    Students.displayInfoAboutAllStudents();
}
}
