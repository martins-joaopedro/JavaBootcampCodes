package model.member;

import java.util.LinkedHashSet;
import java.util.Set;

import model.activity.Activity;
import model.activity.Mentoring;

public class Member {
    
    private String name;
    protected Set<Activity> courses;
    protected Set<Activity> mentories;
   
    public Member(String name) {
        this.name = name;
        this.courses = new LinkedHashSet<>();
        this.mentories = new LinkedHashSet<>();
    }

    public Set<Activity> getCourses() {
        return courses;
    }

    public void setCourses(Set<Activity> courses) {
        this.courses = courses;
    }

    public Set<Activity> getMentories() {
        return mentories;
    }

    public void setMentories(Set<Activity> mentories) {
        this.mentories = mentories;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

}
