package grades;

import java.util.HashMap;

// It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 Student objects with at least 3 grades each, and add them to the map.
//
//Be creative! Make up GitHub usernames and grades for your student objects.

// Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
//        creating student obj
        Student student0 = new Student("Ashley");
        student0.addGrade(98.2);
        student0.addGrade(95.1);
        student0.addGrade(68.2);

        Student student1 = new Student("Crystal");
        student1.addGrade(78.2);
        student1.addGrade(45.1);
        student1.addGrade(98.2);

        Student student2 = new Student("Chuy");
        student2.addGrade(56.1);
        student2.addGrade(32.9);
        student2.addGrade(76.4);

        Student student3 = new Student("Chica");
        student3.addGrade(99.8);
        student3.addGrade(93.1);
        student3.addGrade(90.7);
//adding to map
        students.put("ash32", student0);
        students.put("crystal3123", student1);
        students.put("chuychuy", student2);
        students.put("chicy", student3);



    }
}
