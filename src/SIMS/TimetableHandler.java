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
public class TimetableHandler {
// private encapsulates timetableFile so it's available only in this class, TimetableHandler.

    private static File timetableFile = new File("timetable.txt");

    public void createTimetable(Timetable timetable) {
        try {
            FileWriter fw = null;
            fw = new FileWriter(timetableFile, true);

            fw.write(timetable.getcourseClass() + ","
                    + timetable.getTutor() + ","
                    + timetable.getStudentID()
                    + "\n"
            );

            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(CourseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String displayTimetable() {
        String fileContent = "";
        Scanner sc = null;
        try {
            sc = new Scanner(timetableFile);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CourseHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (sc.hasNextLine()) {
            fileContent += sc.nextLine() + "\n";
        }
        sc.close();
        return fileContent;
    }

    public String searchTimetable(String query) {
        query.trim();
        Scanner sc = null;
        try {
            sc = new Scanner(timetableFile);
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
}
