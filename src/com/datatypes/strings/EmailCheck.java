/*Problem Description: Planet one, a leading data management group has been given the task
of storing the records of their one lakh employees. The record contains an email id whose
datatype is String. The logic for validation of the email id needs to be written and hence
implement the following class EmailCheck

EmailCheck
-emailId:String
+getEmailId():String
+setEmailId(String):void
+main(String[] args):void


The validation rules for the email id check are as follows (to be implemented in main()):
Overall Length of the email ID must be greater than 3 and less 20
The email ID must include “@” followed by a minimum of 1 and maximum of 2 “.”
The substring before “@”must contain a combination of Upper case, Lower case and “_”
symbols.
The first letter of the Email ID must be in Upper Case


If all validations are valid,
Display “Email Id is VALID!”
Else,
Display “<Appropriate Error Message>”
“Invalid Length of email Id”
“Invalid Position of Special Characters”
“Invalid Combination for username”
“Invalid Case of First Letter”
*/

package com.datatypes.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck {
    private String emailId;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailCheck emailCheck = new EmailCheck();

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();
        emailCheck.setEmailId(email);

        if (emailCheck.isValidEmail()) {
            System.out.println("Email Id is VALID!");
        } else {
            System.out.println("Invalid: " + emailCheck.getError());
        }

        scanner.close();
    }

    public boolean isValidEmail() {
        // Regular expression pattern for email validation
        String regex = "^[A-Z][A-Za-z0-9_]*@[A-Za-z.]+\\.[A-Za-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);

        if (!matcher.matches()) {
            setError("Invalid Format");
            return false;
        }

        String[] parts = emailId.split("@");
        String username = parts[0];

        if (!isValidUsername(username)) {
            setError("Invalid Combination for username");
            return false;
        }

        return true;
    }

    private boolean isValidUsername(String username) {
        return username.matches(".*[a-z].*") && username.matches(".*[A-Z].*") && username.contains("_");
    }

    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

