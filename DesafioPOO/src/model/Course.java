package model;

public class Course {
    
    private String name;
    private String description;
    private Integer hours;

    public Course(String name, String description, Integer hours) {
        this.name = name;
        this.description = description;
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

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

}
