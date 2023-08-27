package com.javaLang.string4;

public class EmailCheck {
    private String emailId;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public static void main(String[] args) {
        EmailCheck emailCheck = new EmailCheck();
        emailCheck.setEmailId("Rreddayjammula@gmail.com");
        String email = emailCheck.getEmailId();
        if (isVaildEmail(email)) {
            System.out.println("Email Id is VALID!");
        } else {
            System.out.println("Invalid Email Id");
        }

    }
    private static boolean isVaildEmail(String email) {
        if (email.length() < 3 || email.length() > 20) {
            System.out.println("Invalid Length of email Id");
            return false;
        }


        int atPos = email.indexOf('@');
        int dotPos = email.lastIndexOf('.');
        if (atPos < 0 || dotPos < 0 || dotPos <= atPos + 1 || dotPos == email.length() - 1) {
            System.out.println("Invalid Position of Special Characters");
            return false;
        }

        String username = email.substring(0, atPos);
        if (!isUsernameValid(username)) {
            System.out.println("Invalid Combination for username");
            return false;
        }
        if (!Character.isUpperCase(email.charAt(0))) {
            System.out.println("Invalid Case of First Letter");
            return false;
        }

        return true;
    }
    private static boolean isUsernameValid(String username) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasUnderscore = false;

        for (char c : username.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (c == '_') {
                hasUnderscore = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasUnderscore;
    }
}
