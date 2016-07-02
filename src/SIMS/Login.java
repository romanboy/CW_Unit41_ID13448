package SIMS;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radu Ciuca
 */
public class Login {
    //attributes required to login a user
    File loginFile = new File("login.txt");
    String username;
    String password;
    String usertype;
    
    public boolean LoggedIN = true;
    
    /*****************************************************************
       About: This functions declares the variables
        *****************************************************************/
   
    
    public void setPassword (String password){
        this.password = password;
    }
    public void setUsername (String username){
        this.username = username;
    }
    public void setUserType (String usertype){
        this.usertype = usertype;
    }
    
       /*****************************************************************
       About: This function logs in the user, based on their user type 
        *****************************************************************/
    public boolean LogIn() throws FileNotFoundException, IOException
    {
         try {
            // TODO add your handling code here:
            Scanner sc = new Scanner(loginFile);
            String line = ""; //get data from line by line, then put it in variable line
            while(sc.hasNextLine())
            {
                line = sc.nextLine();
                String uname =line.substring(line.indexOf("username:")+ 10,
                        line.indexOf(", password"));
                String pword =line.substring(line.indexOf("password:")+ 10,
                        line.indexOf(", usertype:"));
                String utype = line.substring(line.indexOf("usertype: ")+ 10, line.indexOf(".;")).trim();
                //student, admin, tutor or parent?
                if(uname.equals(username) && pword.equals(password) && utype.equals(usertype))
                {
                    //login
                    if(utype.equals("admin"))
                    {
                        //jLabel3.setText("admin.");
                        AdminGUI.mainForm.setVisible(true);
                        
                    }
                    else if(utype.equals("parent"))
                    {
                        //jLabel3.setText("parent.");
                        ParentGUI.mainForm.setVisible(true);
                    }
                    else if (utype.equals("tutor"))
                    {
                        //jLabel3.setText("tutor.");
                        TutorGUI.mainForm.setVisible(true);
                    }
                    else if(utype.equals("student"))
                    {
                        //jLabel3.setText("student.");
                        StudentGUI.mainForm.setVisible(true);
                    }
                            
                    //Person.mainForm.setVisible(true);
                    break;
                }
                else
                {
                    //don't login, show error
                }
            }
        
            //closing file
            sc.close();
         }
         catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
         //returnign boolean value to get access in system
        return LoggedIN;
    } 
    
}
