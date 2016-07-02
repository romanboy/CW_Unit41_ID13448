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
public class Email {

    private String toName;
    private String toEmail;
    private String message;

    public Email(String toName, String toEmail, String message) {
        this.toName = toName;
        this.toEmail = toEmail;
        this.message = message;

    }

    public String gettoName() {
        return toName;
    }

    public void settoNameCourse(String toName) {
        this.toName = toName;
    }

    public String gettoEmail() {
        return toEmail;
    }

    public void settoEmail(String toEmail) {
        this.toEmail = toEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String Message) {
        this.message = message;
    }
}
