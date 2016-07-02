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
public class CourseHandler {
// private encapsulates courseFile so it's available only in this class, CourseHandler.

    private static File courseFile = new File("course.txt");

    public void createCourse(Course course) {
        try {
            FileWriter fw = null;
            fw = new FileWriter(courseFile, true);
            
            fw.write(course.getClassname() + ","
                    + course.getWeekday() + ","
                    + course.getTime()
                    + "\n"
            );

            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CourseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public String displayCourseData() {
        String fileContent = "";
        Scanner sc = null;
        try {
            sc = new Scanner(courseFile);
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
