/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author 22112
 */
public class PasswordValidator {
    
    Scanner sb = new Scanner(System.in);
    
    public String createPassword() {
        
        boolean isValid = false;
        String password = "";
        
        while (!isValid) {
           System.out.println("Passwords must have at least 8 characters");
           System.out.println("Passwords must have at least one special character");
           System.out.println("Please enter your desired password:");

           password = sb.nextLine();
           // check if the password is valid or not
           int specialCharCount = 0;
           //iterate over each character to see if it is a special character
           for (int i = 0; i < password.length(); i++) {
               if (!(Character.isLetterOrDigit(password.charAt(i)))) {
                   //now we know there is at least one special character
                   specialCharCount++;
               }
           }
           if (specialCharCount > 0 && password.length() > 7) {
               isValid = true;
           }
        }
        
        return password;
    }
}
