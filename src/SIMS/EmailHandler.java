package SIMS;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
public class EmailHandler {
  private static File emailFile = new File("email.txt");

    public void createEmail(Email email) {
        try {
            FileWriter fw = null;
            fw = new FileWriter(emailFile, true);
            
            fw.write("To Name:" + email.gettoName() + ", To Email:"
                    + email.gettoEmail() + ", Message:"
                    + email.getMessage()
                    + "\n"
            );

            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CourseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      
}
