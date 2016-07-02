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
public class Timetable {
    
    private String courseClass;
    private String tutor;
    private String studentID;

    public Timetable(String courseClass, String tutor, String studentID) {
        this.courseClass = courseClass;
        this.tutor = tutor;
        this.studentID = studentID;

    }

    public String getcourseClass() {
        return courseClass;
    }

    public void setCourse(String courseClass) {
        this.courseClass = courseClass;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
