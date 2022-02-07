package Practicas.OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Course {
    //  Atributos
    String courseName;
    String professorName;
    HashMap<String,Integer> students = new HashMap<>();
    int year;

    public Course(String nameCourse, String Profe, int Year){
        // Constructor
        this.courseName = nameCourse;
        this.professorName  = Profe;
        this.year = Year;
    }

    public void enroll(Student student) {
        // Añade un estudiante a la clase
        students.put(student.firstName + " " + student.lastName,student.grade);
        System.out.println("Success!");
    }

    public void unEnroll(Student student) {

        if (this.students.containsKey(student.firstName + " " + student.lastName)) {
            this.students.remove(student.firstName + " " + student.lastName,student.grade);
            System.out.println("Success Delete !!");
        } else {
            System.out.println("No exist!!");
        }
    }

    public int countStudents() {
        System.out.println("Size of course: " + this.students.size());
        return 0;
    }

    public int bestGrade() {
        List<Integer> studentSort = new ArrayList<>(students.values()); 
        Collections.sort(studentSort);
        System.out.println("El mejor influencer saco: " + studentSort.get(studentSort.size()-1) + " Felicidades!!!");
        return 0;
    }
}
