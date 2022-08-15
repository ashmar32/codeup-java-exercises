package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Ashley");
        student.addGrade(98.2);
        student.addGrade(95.1);
        student.addGrade(68.2);
        System.out.println("student.getStudentName() = " + student.getStudentName());
        System.out.println("student.getStudentGrade() = " + student.getStudentGrade());
        System.out.println("student.avgGrade() = " + student.avgGrade());

        Student student1 = new Student("Crystal");
        student1.addGrade(78.2);
        student1.addGrade(45.1);
        student1.addGrade(98.2);
        System.out.println("student.getStudentName() = " + student1.getStudentName());
        System.out.println("student.getStudentGrade() = " + student1.getStudentGrade());
        System.out.println("student.avgGrade() = " + student1.avgGrade());

        ArrayList<Double> studentArray =  new ArrayList<>() ;
        studentArray.add(student.avgGrade());
        studentArray.add(student1.avgGrade());
        System.out.println("studentArray = " + studentArray);
//        System.out.println(studentArray.size());
        int counter = 0;
            counter += ((student.avgGrade() + student1.avgGrade()) / studentArray.size());
        System.out.println(counter);
    }
}
