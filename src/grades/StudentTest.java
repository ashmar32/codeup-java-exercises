package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Ashley");
        student.addGrade(98.2);
        student.addGrade(95.1);
        student.addGrade(68.2);
        student.addGrade(68.0);
        System.out.println("student.getStudentName() = " + student.getStudentName());
        System.out.println("student.getStudentGrade() = " + student.getStudentGrade());
        System.out.println("student.avgGrade() = " + student.avgGrade());

    }
}
