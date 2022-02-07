package Practicas.OOP;

public class Student {
    // Estos son los atributos de clase
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student(String name,String lastName, int registration, int grade, int year){
        // Este es el constructor
        this.firstName = name;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    // Métodos
    public void printFullName() {
        // Imprime el nombre completo del estudiante
        System.out.println("Name Student: " + this.firstName + " " + this.lastName);
    }

    public boolean isApproved() {
        // Imprime si paso el tonto
        if(this.grade>=60){
            return true;
        }
        return false;
    }

    public int changeYearIfApproved() {
        // Cambia de año en caso de aprovar
        if(this.grade>=60){
            year+=1;
            System.out.println("Congratulations");
        }
        return 0;
    }
}
