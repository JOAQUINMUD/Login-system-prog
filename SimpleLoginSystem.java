
package simpleloginsystem;

import java.util.Scanner;

public class SimpleLoginSystem { 
    //Class variables to store user information 
    String username;
    String password;
    String cellNumber;
    String firstName;
    String lastName;
    
    //Scanner object for user input
    private Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        SimpleLoginSystem system = new SimpleLoginSystem();
        system.runProgram();
       
    }
    public void runProgram(){
        System.out.println("===Welcome to the registration sytem===");
       
        //Get user information 
        System.out.print("Enter your first name:");
        firstName = scanner.nextLine(); 
        
        System.out.print("Enter your last name:");
        lastName = scanner.nextLine(); 
        
        //Register the user 
        registerUser();
        
        //Try to login 
        loginUser(); 
        
        scanner.close();
        
        
    
    } 
    //Method to handle user registration
    public void registerUser() {
        System.out.println("/n--- Registration ---");
        
        //keep asking username until it's valid 
        boolean validUsername = false; 
        while (!validUsername) {
            System.out.println("Enter a  username(must contain'-' and be 5 characters or less):");
            username = scanner.nextLine();
            validUsername = checkUsername();
            
            if (!validUsername){
                System.out.println("Username is not correctly formatted.please try again.");
            }else{ 
                System.out.println("Username successfully captured");
            
            }
        
        }
    //Keep asking for apssword until it's valid 
    boolean validPassword = false;
    while(!validPassword){
        System.out.println("Enter a password(at least 8 characters,with a capital letter,numer, and special charatcter):");
        password = scanner.nextLine();
        validPassword = checkPassword();
        
        if(!validPassword){
            System.out.println("Password is not correctly formatted.Please try again.");
        }else{
            System.out.println("Password succesfully captured.");
        
        }    
        
        }
    
    //Keeo asking for cell number until its valid
    boolean validCellNumber = false;
    while(!validCellNumber){
        System.out.print("Enter your cell number(with international code,e.g.,+698161643):");
        cellNumber = scanner.nextLine();
        validCellNumber = checkCellNumber();
        
        if(!validCellNumber){ 
            System.out.println("Cell number is incorrectly formattewd.Please try again.");
        }else{
            System.out.println("Cell number succesfully captured.");
        }
    } 
    System.out.println("Your Registration was succesfull!Welcome" +firstName +"" + lastName +"!");
    
    }
    //Method for password 
    public boolean checkUsername(){
        //Check if username has underscore and si 5 characters or less
        
    return username.contains("-") && username.length()<= 5;
    } 
    //Method to check password
    public boolean checkPassword(){
        //Check is password is atleast 8 characters
        if(password.length()<8){
            return false;
        }
        //Check for atleast one capital letter,one number,and one special character
        boolean hasCapital =false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

         for (int i =0;i < password.length(); i++) {
             char c = password.charAt(i);
             
             if (Character.isUpperCase(c)){
                 hasCapital = true;                
             }else if (Character.isDigit(c)){
                 hasNumber =true;
             }else if(!Character.isLetterOrDigit(c)){
                 hasSpecial =true;
             }
         } 
         return hasCapital &&hasNumber && hasSpecial;
    }
   //Method to check cell number
    public boolean checkCellNumber(){
        //Check if cell number starts with '+' and has 10-12 digits
        if (cellNumber.startsWith("+") && cellNumber.length()>=11 && cellNumber.length()<=13){
            //Check if the rest are all digits
            for (int i =1; i<cellNumber.length(); i++){
                if(Character.isDigit(cellNumber.charAt(i))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    // Method to handle user login 
    public void loginUser(){
        System.out.println("/n-- Login---"); 
        
        System.out.print("Enter your username:");
        String inputUsername = scanner.nextLine();
    
        System.out.print("Enter your password:");
        String inputPassword = scanner.nextLine();
        
        //Check if credentials match 
        if (inputUsername.endsWith(username) && inputPassword.equals(password)){
            System.out.println("Welcome" +firstName + "" + lastName +"It is great to see you");
        
        }else{
            System.out.println("Username or password incorrect.Please enter correct credentials");
        }
    }

    boolean loginUser(String wrong, String pass123) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    }
    
    

