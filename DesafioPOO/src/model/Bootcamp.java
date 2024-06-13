package model;

import java.lang.reflect.Member;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import model.activity.Activity;

public class Bootcamp {
    
    private String name;
    private String description;
    private final LocalDate startDate;
    private final LocalDate endDate;
    
    private Set<Activity> courses;
    private Set<Activity> mentories;
    private Set<Member> members;
    
    public Bootcamp (
        String name, 
        String description, 
        LocalDate startDate
    ) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = this.startDate.plusDays(45);
        this.courses = new LinkedHashSet<>();
        this.members = new LinkedHashSet<>();
        this.mentories = new LinkedHashSet<>();
    }

    public void listCourses() {
        for(Activity c : this.courses)
            c.listInformations();
    }

    public void listMentories() {
        for(Activity m : this.mentories)
            m.listInformations();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Activity> getCourses() {
        return courses;
    }

    public void setCourses(Set<Activity> courses) {
        this.courses = courses;
    }

    public void addCourse(Activity c) {
        this.courses.add(c);
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }

    public void addMember(Member m) {
        this.members.add(m);
    }

    public Set<Activity> getMentories() {
        return mentories;
    }

    public void setMentories(Set<Activity> mentories) {
        this.mentories = mentories;
    }

    public void addMentoring(Activity m) {
        this.mentories.add(m);
    }

    public void listInformations() {
        System.out.println("NOME: " + this.name);
        System.out.println("DESCRIÇÃO: " + this.description);
        System.out.println("INCIO: " + this.startDate);
        System.out.println("FIM: " + this.endDate);

        System.out.println("------------------------");
        System.out.println("CURSOS: ");
        listCourses();

        System.out.println("------------------------");
        System.out.println("MENTORIAS: ");
        listMentories();
    }
    
}
