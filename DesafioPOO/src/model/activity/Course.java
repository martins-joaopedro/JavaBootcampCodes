package model.activity;

import model.member.Educator;

public class Course extends Activity {

    public Course(String name, String description, Integer hours, Educator educator) {
        super(name, description, hours, educator);
    }

    @Override
    public double calcXP() {
        return DEFAULT_XP * getHours();
    }

}
