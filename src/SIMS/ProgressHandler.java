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
public class ProgressHandler {
    
    private static File progressFile = new File("progress.txt");

    public void recordProgress(Progress progress) {
        try {
            FileWriter fw = null;
            fw = new FileWriter(progressFile, true);

            fw.write(progress.getStudentID() + ","
                    + progress.getCourse() + ","
                    + progress.getGrade() + "\n"
            );

            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(StudentHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String searchProgress(String query) {
        query.trim();
        Scanner sc = null;
        try {
            sc = new Scanner(progressFile);
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
    
    public String displayProgressData() {
        String fileContent = "";
        Scanner sc = null;
        try {
            sc = new Scanner(progressFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CourseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (sc.hasNextLine()) {
            fileContent += sc.nextLine() + "\n";                                
        }
        sc.close();
        return fileContent;
    }
}
