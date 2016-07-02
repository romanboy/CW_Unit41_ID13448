package SIMS;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radu Ciuca
 */

public class Admin extends Person{

    public Admin(String password, String username, String firstname, String lastname, String telephone, String email, String gender, String dob, boolean loggedIn) {
        super(password, username, firstname, lastname, telephone, email, gender, dob, loggedIn);
    }

}
