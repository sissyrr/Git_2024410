/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024410;

import java.util.Scanner;

/**
 *
 * @author sissy
 */
public class Git_2024410 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myKB = new Scanner (System.in); //using scanner to read input from keyboard

        String userName; //text variable will store the name entered
        
        do {
            System.out.println("Please enter your name"); //input request to the user
            System.out.println("You must enter text only!");
            
            //variable content will be what's typed in the keyboard
            //remove whitespaces from the start and end of the string
            userName = myKB.nextLine().trim();
            
            //if the user inputs numbers an error message will display before the loop starts again
            if (!userName.matches("[a-zA-Z!.?', ]+")) {
                System.out.println("INVALID NAME! Sorry, I will not accept numbers");
            }
        
        //the loop will continue until the user inputs a regular name with text only    
        }while  (!userName.matches("[a-zA-Z!.?', ]+"));
        
        //success message
        System.out.println("That's a beautiful name! Let's try some combinations:");
        
        System.out.println("Uppercase: " + userName.toUpperCase());
        System.out.println("Lowercase: " + userName.toLowerCase());
        
        //used substring method to get first letter only
        System.out.println("First lowercase: " + userName.substring(0,1).toLowerCase() 
                                               + userName.substring(1).toUpperCase());
        
        //used substring method and lenght to put last letter at the beginning,
        //then the middle of word, and then the first letter at the end
        System.out.println("First and last letter swapped: " + userName.substring(userName.length()-1) 
                                                             + userName.substring(1, userName.length()-1)
                                                             + userName.substring(0,1));
    }
    
}
