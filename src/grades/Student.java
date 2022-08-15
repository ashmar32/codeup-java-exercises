package grades;
import javax.swing.*;
import java.util.ArrayList;


// Create a class named Student.
public class Student {
// It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers.
    private String studentName;
    private ArrayList<Double> studentGrade;
//  The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList.
    public Student(String studentName) {
        this.studentName = studentName;
        studentGrade = new ArrayList<>();
    }

// getters/setters
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Double> getStudentGrade() {
        return studentGrade;
    }

    public void addGrade(Double studentGrade) {
        this.studentGrade.add(studentGrade);
    }

    public double avgGrade() {
        int counter = 0;
        for (int i = 0; i < studentGrade.size(); i++) {
            counter += studentGrade.get(i);
        }
        return counter /studentGrade.size();
    }


}




//String name = JOptionPane.showInputDialog("Please enter a name");
//        JOptionPane.showMessageDialog(null, "hello " + name);