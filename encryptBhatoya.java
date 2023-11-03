/*
 Name: Jasvine Bhatoya
 Date: 10/28/2022
 Description: This program is designed to encrypt and decrypt text messages. 
 In order to do this, the Caesar Cipher algorithm is going to be used to make this
 program effective. 
 Self grade: 100  
 */
 
/*The main method below called "textMenu" which contains the scanner and 
the output where the user can enter their input.*/  
import java.util.*;

        public class  encryptBhatoya
        
        {
        //there is no code here; the method is below.
        }  
        class Text 
        {
  
        public static void main(String[] args) 
     
        {
        textMenu();               
        }
   
/* Below is the code that scans the integers and displays the program itself 
which the user can input their answers */

   public static void textMenu( )
   {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) 
        {
        display();
                
        System.out.print("Enter your choice ---> ");
        String choice = scanner.nextLine();
                
        if (!(choice.equalsIgnoreCase("E") || choice.equalsIgnoreCase("D"))) 
        
        {
        System.out.println("Invalid choice");
        System.out.println("--------------------------------------------------");
        continue;
        }
        
        System.out.print("Enter your choice without any digits in it---> ");
        String s = scanner.nextLine();
        System.out.print("Key ---> ");
        int key = Integer.parseInt(scanner.nextLine());
           
        if (key < 0) 
        {
        System.out.println("Invalid key, Key must be a positive number");
        System.out.println("-----------------------------------------------");
        continue;
        }
           
        if (choice.equalsIgnoreCase("E"))
           
        {
        System.out.println("The Encrypted message is : " + upperCase(s, key));
        } 
            
        else if (choice.equalsIgnoreCase("D"))
        
        {       
        System.out.println("The decrypted message is : ");
        System.out.println(letters(s, key));
        }
            
        System.out.println("-----------------------------------------------");
        }
        }
/*
 * Returns a new string with the letters of the given string shifted
 * forward or backward by the amount equal to the given key.
 * For example, shift("hello", 3) returns "khoor".
 */
        public static String upperCase(String s, int key) 
        {
        String result = "";
        s = s.toUpperCase();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) 
        
        {
        char letter = s.charAt(i);
        
        if (letter == ' ')
        letter = '#';
                
        else 
        {
        if (letter >= 'A' && letter <= 'Z') 
        {
            
        letter = (char) (letter + key);
        if (letter > 'Z') 
                    
        {
        letter = (char) (letter - 26);
        }
        
        }
        }
        result += letter;
        }
        return result;
        } 
 /*
 * decrypts the encrypted string using the same key value. 
 * For example, decrypt("khoor", 3) returns "hello".
 */
 
        public static String letters(String s, int key)
        {
            String result = "";
            for (int i = 0; i < s.length(); i++) 
            
        {
            char letter = s.charAt(i);
            if (letter == '#') 
        
        {
            letter = ' ';
        }
            else 
        {
            if (letter >= 'A' && letter <= 'Z') 
        {
            letter = (char) (letter - key);
        }
            if (letter < 'A') 
        {
            int diff = 'A' - letter;
            letter = (char) ('Z' - diff + 1);
       
        } 
            else if (letter > 'Z')
        {
           int diff = 'Z' - letter;
           letter = (char) ('A' + diff + 1);
        }
        }
           result += letter;
        }
           return result;
   }
   
   /*This method displays a menu for the user to choose the option.
   refer to the provided output to see the menu*/
   
   public static void display()
   {
        System.out.println("Enter 'E' or 'e' to encrypt your message: ");
        System.out.println("Enter 'D' or 'd' to decrypt your message: ");
        System.out.println("----------------------------------------------");
   }
//*********************************************************************************
}