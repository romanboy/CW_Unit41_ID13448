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
public class AttendanceHandler {

    private static File attendanceFile = new File("attendance.txt");

    public void recordAttendance(Attendance attendance) {
        try {
            FileWriter fw = null;
            fw = new FileWriter(attendanceFile, true);

            fw.write(attendance.getStudentID() + ","
                    + attendance.getCourse() + ","
                    + attendance.getPresence() + "\n"
            );

            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(StudentHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String searchAttendance(String query) {
        query.trim();
        Scanner sc = null;
        try {
            sc = new Scanner(attendanceFile);
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
    
    public String displayAttendanceData() {
        String fileContent = "";
        Scanner sc = null;
        try {
            sc = new Scanner(attendanceFile);
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
