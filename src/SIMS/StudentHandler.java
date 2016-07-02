package SIMS;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
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
public class StudentHandler {
// private encapsulates studentFile so it's available only in this class, StudentHandler.

    private static File studentFile = new File("student.txt");

    public void enrolStudent(Student student) {
        try {
            FileWriter fw = null;
            fw = new FileWriter(studentFile, true);

            fw.write(student.getId() + ","
                    + student.getUsername() + ","
                    + student.getPassword() + ","
                    + student.getFirstname() + ","
                    + student.getLastname() + ","
                    + student.getGender() + ","
                    + student.getDob() + ","
                    + student.getEmail() + ","
                    + student.getTelephone() + "\n"
            );

            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(StudentHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


        public String searchStudent(String query) {
        query.trim();
        Scanner sc = null;
        try {
            sc = new Scanner(studentFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        sc.useDelimiter(",");

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.contains(query)) {
                String details = line.substring(line.indexOf(","), line.indexOf(",")).trim();
                return line;
            }
        }
        sc.close();
        return query + " is not available in the system";
    }
    
    
    public String displayStudentData() {
        String fileContent = "";
        Scanner sc = null;
        try {
            sc = new Scanner(studentFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (sc.hasNextLine()) {
            fileContent += sc.nextLine() + "\n";                                
        }
        sc.close();
        return fileContent;
    }
 
}

