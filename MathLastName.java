import java.util.Scanner;
/*
name
date
program description
self grade
*/
public class MathLastName
{
   //no code goes here
}
class Expression
{
   public static void main(String[] args)
   {
      start();
   }
   /* This must be the last method to implement
   After you have implemented all the methods*/
   public static void start()
   {
      Scanner kb = new Scanner(System.in);
      System.out.print("How many times do you want to use the software: ");
      int count = kb.nextInt();
      for(int i = 1; i <= count; i++)
      {  
      
          //your code, refeer to the word document         
      }
   }
   /*This method get the opration and returns the name of the operation in words. for example
   if the operation is * , it should return multiply.
   must use switch statement  */
   public static String convertOpToWords(String operator)
   {
         // your code
          
      return "";
   }
   
   /* This method gets a number 1-9 and returns it in  words.
   for example if the num is 1 it shuld return one
   must use if/else statements in this method
   */
    
   public static String convertNumToWord(int a)
   {       
     // your code
      return "";
   }
   /*
   this method gets two numbers and the operation and returns the result of the expression.
   for example if this method gets 3, 2 and * , then the method should return 6
   Must use switch cases  
   */
   public static int evaluate(int a, int b, String op)
   {
      //your code          
      return 0;                 
   }
   /*This method list all the operations that the user can choose from. 
   You must create your own menu and  not to use the menu that I provided in the sample output
   be creative and provide a user freindly menu.
   providing the exact same menu as the sample output, will not get credit  
   */
   public static void list()
   {
     // your code
          
   }
}