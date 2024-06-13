package model.member;

import java.util.LinkedHashSet;
import java.util.Set;

import model.Bootcamp;
import model.activity.Activity;

public class Student extends Member {
    
    private Set<Activity> completedCourses;
    private Set<Activity> completedMentories;

    public Student(String name) {
        super(name);
        this.completedCourses = new LinkedHashSet<>();
        this.completedMentories = new LinkedHashSet<>();
    }

    public void subscrible(Bootcamp b) {
        this.courses.addAll(b.getCourses());
        this.mentories.addAll(b.getMentories());
    }
    
    public void completeCourse(Activity c) {
        
        if(this.courses.contains(c)) {
            this.courses.remove(c);
            this.completedCourses.add(c);
        }
    }

    public void completeMentoring(Activity m) {
        
        if(this.mentories.contains(m)) {
            this.mentories.remove(m);
            this.completedMentories.add(m);
        }
    }

    public double calcXP() {
        double totalXP = 0d;
        
        if(!this.completedCourses.isEmpty())
            for(Activity c : completedCourses)
                totalXP += c.calcXP();
        
        if(!this.completedMentories.isEmpty())
            for(Activity m : completedMentories)
                totalXP += m.calcXP();
            
        return totalXP;
    }

    public Set<Activity> getCompletedCourses() {
        return completedCourses;
    }

    public void setCompletedCourses(Set<Activity> completedCourses) {
        this.completedCourses = completedCourses;
    }

    public void setCompletedMentories(Set<Activity> completedMentories) {
        this.completedMentories = completedMentories;
    }

    public Set<Activity> getCompletedMentories() {
        return completedMentories;
    }

    public void listCourses() {
        for(Activity c : getCourses())
            c.listInformations();
    }

    public void listMentories() {
        for(Activity m : getMentories())
            m.listInformations();
    }

    public void listCompletedCourses() {
        for(Activity c : getCompletedCourses())
            c.listInformations();
    }

    public void listCompletedMentories() {
        for(Activity m : getCompletedMentories())
            m.listInformations();
    }

    public void listInformations() {
        System.out.println("------------------------");
        System.out.println("NOME: "  + getName());

        if(!this.courses.isEmpty()) {
            System.out.println("CURSOS INSCRITOS: ");
            listCourses();
        }

        if(!this.mentories.isEmpty()) {
            System.out.println("MENTORIAS INSCRITAS: ");
            listMentories();
        }

        System.out.println("CURSOS FINALIZADOS: ");
        listCompletedCourses();

        System.out.println("MENTORIAS FINALIZADAS: ");
        listCompletedMentories();

        System.out.println("TOTAL XP: " + calcXP());
    }

}
