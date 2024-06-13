package model.activity;

import model.member.Educator;

public abstract class Activity {
    
    private String name;
    private String description;
    private Integer hours;
    private Educator educator;
    protected static final Double DEFAULT_XP = 10d;

    public Activity(String name, String description, Integer hours, Educator educator) {
        this.name = name;
        this.description = description;
        this.hours = hours;
        this.educator = educator;
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

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Educator getEducator() {
        return educator;
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
    }

    public void listInformations() {
        System.out.println("NOME: " + this.name);
        System.out.println("DESCRIÇÃO: " + this.description);
        System.out.println("HORAS: " + this.hours);
        System.out.println("EDUCADOR: " + this.educator.getName());
        System.out.println();
    }

    public abstract double calcXP();
}
