package model.activity;

import model.member.Educator;

public class Mentoring extends Activity {
    
    private String date;
   
    public Mentoring(String name, String description, Integer hours, String date, Educator educator) {
        super(name, description, hours, educator);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public double calcXP() {
        return DEFAULT_XP + 50d;
    }

}

