package model;

public class Mentoring {
    
    private String name;
    private String description;
    private String date;
    private Integer hours;

    public Mentoring(String name, String description, String date, Integer hours) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.hours = hours;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

}

