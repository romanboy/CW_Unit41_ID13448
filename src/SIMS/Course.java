package SIMS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radu Ciuca
 */
public class Course {

    private String className;
    private String weekday;
    private String time;

    public Course(String className, String weekday, String time) {
        this.className = className;
        this.weekday = weekday;
        this.time = time;

    }

    public String getClassname() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
