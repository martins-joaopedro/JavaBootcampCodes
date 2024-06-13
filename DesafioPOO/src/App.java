import java.time.LocalDate;
import java.util.Set;

import model.Bootcamp;
import model.activity.Activity;
import model.activity.Course;
import model.activity.Mentoring;
import model.member.Educator;
import model.member.Student;

public class App {
    
    public static void main(String[] args) {
        
        Bootcamp b1 = new Bootcamp("Backend com Java", "Aprenda Backend com Java do 0", LocalDate.now());
        
        Educator e1 = new Educator("Camila");
        Educator e2 = new Educator("Pedro");
        Student s1 = new Student("João");
        
        Activity c1 = new Course("Java Básico", "Aprendendo do início", 2, e1);
        Activity c2 = new Course("Java Intermediário", "Aprendendo Java Collections", 2, e1);
        Activity c3 = new Course("Spring Boot", "Aprendendo SpringBoot do início", 3, e2);
        Activity c4 = new Course("Banco de Dados", "Aprenda Banco de Dados", 3, e2);

        Activity m1 = new Mentoring("Mentoria de Java", "Resolvendo exercícios", 1, "10/03/2024", e1);
        Activity m2 = new Mentoring("Mentoria de Spring Boot", "Criando API", 1, "15/03/2024", e2);
        
        b1.setCourses(Set.of(c1, c2, c3, c4));
        b1.setMentories(Set.of(m1, m2));
        b1.listInformations();

        s1.subscrible(b1);
        s1.completeCourse(c1);
        s1.completeCourse(c2);
        s1.completeMentoring(m1);
        s1.listInformations();
    }
}
