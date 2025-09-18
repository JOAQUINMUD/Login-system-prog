package simpleloginsystem;

import java.util.Scanner;

public class login { 
    //Class variables to store user information 
    private String username;
    private String password;
    private String cellNumber;
    private String firstName;
    private String lastName;
    
    SimpleLoginSystem login = new SimpleLoginSystem();
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
    
    
}
