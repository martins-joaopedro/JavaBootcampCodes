package model.member;

import java.util.LinkedHashSet;
import java.util.Set;

import model.activity.Activity;
import model.activity.Mentoring;

public class Educator extends Member {

    public Educator(String name) {
        super(name);
    }

    public void addCourse(Activity c) {
        this.courses.add(c);
    }

    public void addMentoring(Mentoring m) {
        this.mentories.add(m);
    }

}
