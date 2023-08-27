package com.javaLang.strings3;

public class Login {
    private String username;
    private String password;

    // Initialize usernames and passwords arrays
    static String[] usernames = {"admin", "finance", "student"};
    static String[] passwords = {"Admin", "Finance", "Student"};


    public Login() {
        username = "student";
        password = "Student";
    }


    public boolean validateLogin() {
        for (int i = 0; i < usernames.length; i++) {
            if (username.equalsIgnoreCase(usernames[i])) {
                if (password.equals(passwords[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}

