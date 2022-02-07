package Practicas.OOP;

public class App {
    public static void main(String[] args) {
        Student jair = new Student("Jair","Rodriguez",1029,89,2020);
        Student berthungas = new Student("El","Berthungas",2991,70,2020);
        Student luisillo = new Student("Luisillo","Pillo",2029,60,2020);
        Student escorpion = new Student("Escorpion","Dorado",1021,100,2020);


        Course cursoInfluencer = new Course("Curso Influencer", "Alfredo Adame & Carlos Trejo", 2022);
        cursoInfluencer.enroll(luisillo);
        cursoInfluencer.enroll(berthungas);
        cursoInfluencer.enroll(jair);
        cursoInfluencer.enroll(escorpion);
        cursoInfluencer.countStudents();
        cursoInfluencer.unEnroll(jair);
        cursoInfluencer.countStudents();
        cursoInfluencer.bestGrade();
    }
}
