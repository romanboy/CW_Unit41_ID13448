package SIMS;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radu Ciuca - 13448
 */
public class Student extends Person{
    
    private int id;
    
    	public Student(int id, String password, String username,
			String firstname, String lastname, String telephone, String email,
			String gender, String dob, boolean loggedIn) {
		super(password, username, firstname, lastname, telephone, email, gender, dob, loggedIn);
                this.id = id;
	}
        
        public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
