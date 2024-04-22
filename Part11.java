/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part1.pkg1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author cash
 */
public class Part11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Getting the user to input their option first between sign in and sign up
        Scanner enter = new Scanner(System.in);
        System.out.println("Press one to go to the sign up/ sign in section");
        int enter1 = enter.nextInt();
        
        int selectOption = 1;
      
        //if statement to ensure the user inserts the number 1
        if(enter1 == selectOption) {
            System.out.println("Sending you to sign up/sign in section");
        }
        if(enter1 != selectOption){
           System.out.println("Enter the number 1 to continue");
        }    
     
        int selectOptionVarious = 2;
        int selectOptionVarious2 = 3;
        
       
        Scanner enterPartTwo = new Scanner(System.in);
        System.out.println("Press either 2 to sign up and 3 to sign in");
        int enterPartThree = enterPartTwo.nextInt();
        
        if (enterPartThree == selectOptionVarious) {
            System.out.println("Welcome to the sign in section");
            
            Scanner keyToFrontDoor = new Scanner(System.in);
            System.out.println("Enter Your Username");
            String keyToFrontDoor2 = keyToFrontDoor.nextLine();
            //regex here to restrict and compare 
            
            String parameter = "\\w\\w\\W\\S\\w\\w..\\d";
       String reg = keyToFrontDoor2;
       
         Pattern keyMatch = Pattern.compile(reg);
         Matcher keyCodeconf = keyMatch.matcher(keyToFrontDoor2 + "Welcome");
         
         boolean doesItMatch = keyCodeconf.matches();
         System.out.println(reg);
         
         Scanner key = new Scanner(System.in);
         System.out.println("Enter Your Password");
         String keyInDoor = key.nextLine();
         
        //regex
          String parameter1 = "\\w\\w\\W\\S\\w\\w..\\d";
       String reg1 = keyInDoor;
       
         Pattern keyGoingIn = Pattern.compile(reg1);
         Matcher keyEntered = keyMatch.matcher(keyToFrontDoor2 + "Welcome");
         
         boolean doesItMatch11 = keyEntered.matches();
         System.out.println(reg);
         
        }
        
        if (((enterPartThree == selectOptionVarious2) &&(enterPartThree != selectOptionVarious)&& (enterPartThree == selectOptionVarious2))) {
            System.out.println("Welcome to the sign up section");
            
         Scanner userName = new Scanner(System.in);
         System.out.println("Enter your name");
         String userName2 = userName.nextLine();
         
         Scanner userSurname = new Scanner(System.in);
         System.out.println("Enter your surname");
         String userSurname2 = userSurname.nextLine();
         //array to store the name and surname of the user
            String[] userID;
            userID = new String[2];
            userID[0] = userName2;
            userID[1] = userSurname2;
         
         
         // and here...
         Scanner userUsername = new Scanner(System.in);
         System.out.println("Create a username (No spaces are allowed! to replace it use '_')");
         String userUsername2 = userUsername.nextLine();
         
         //boolean and regex will go here
         Scanner password = new Scanner(System.in);
         System.out.println("Create a password with 8 characters (1 capital,1 Symbol, No Spaces");
         String password1 = password.nextLine();
        
        //RegEx
        
         String parameter = "\\w\\w\\W\\S\\w\\w..\\d";
       String reg = password1;
       
         Pattern keyMatch = Pattern.compile(reg);
         Matcher keyCodeconf = keyMatch.matcher(password1 + "Saved");
         
         boolean doesItMatch = keyCodeconf.matches();
         System.out.println(reg);
       
         //Array to store the users password and username
         String[] userFingerprint;
        userFingerprint = new String[2];
        userFingerprint[0] = userUsername2;
        userFingerprint[1] = password1;
            
         //try and catch here
          try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("userCredentials.txt"));
         writer.write("Details" + userName2 + userSurname2);
         writer.write("\nWelcome");
         writer.close();
         } catch (IOException e) {
             e.printStackTrace();    
         }
        
        //userCredentials.txt 
        File file = new File("/Users/cash/Documents/userCredentials.txt");
        Scanner scan = new Scanner(file);
        System.out.print(scan.nextLine());
        
        }
        
     
             
    }       
        /*  }  */ 
//username contains"_"
    }