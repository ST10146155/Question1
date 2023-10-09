/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Registration;

import java.util.regex.Pattern;

/**
 *
 * @author lab_services_student
 */
public class Login {

    private String firstName;
    private String lastName;
    private String User;
    private String Password;
    public Boolean logIn = false;
    
    public String registerUser(String firstName, String lastName, String User, String Password) {
        if (!this.checkUserName(User)) {
            return "Username is not formatted correctly, please ensure that your username contains an underscore and is not longer than 5 characters.";
        }else if (!this.checkPasswordComplexity(Password)) {
            return "Password is not formatted correctly, please ensure that your password contains at least 8 characters, a captial letter, a number and a special character.";
        }
    this.firstName = firstName;
        this.lastName = lastName;
        this.User = User;
        this.Password = Password;

        return "Password successfully captured. Username successfully captured.";
    }
   
    public Boolean loginUser(String User, String Password) {
        if (User.equals(this.User) && Password.equals(Password)) {
            this.logIn = true;
            return true;
        }

        this.logIn = false;
        return false;
    }

     public boolean checkUserName(String User) {
        if (User.length() <= 5 && User.contains("_")) {
            return true;
        }else {
            return false;
        }
    }

      
    public String returnLoginStatus() {
        if (this.logIn) {
            return "Welcome " + this.firstName + ", " + this.lastName + ", " + "it is nice to see you again";
        }
        return "Username or Password incorreect, please try again.";

    }
   
    public boolean checkPasswordComplexity(String Password) {
        
        boolean containsCapitalLetter = false;
        boolean containsNumber = false;
        boolean containsSpecialChacter = false;
        boolean enoughCharacters = false;

        Pattern specialCharacters = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

        for (int i = 0; i < Password.length(); i++) {
            char character = Password.charAt(i);

            if(Character.isUpperCase(character)) {
                containsCapitalLetter = true;
            }else if (Character.isDigit(character)) {
                containsNumber = true;
            }
        }
       
        if (specialCharacters.matcher(Password).find()) {
           containsSpecialChacter = true;
        }

        if (Password.length() >= 8) {
            enoughCharacters = true;
        }

        return containsCapitalLetter && containsNumber && containsSpecialChacter && enoughCharacters;
    }
}
