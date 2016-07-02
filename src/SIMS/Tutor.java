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
public class Tutor extends Person {

private String tutorCourse;

    public Tutor(String tutorClass, String password, String username, String firstname, String lastname, String telephone, String email, String gender, String dob, boolean loggedIn) {
        super(password, username, firstname, lastname, telephone, email, gender, dob, loggedIn);
        this.tutorCourse = tutorCourse;
    }
}
