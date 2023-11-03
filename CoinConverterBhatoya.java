//Jasvine Bhatoya 9/21/22
//The purpose of this program is to convert a number from the Chinese currency to pennies, quarters, etc.
//Overall, I would give myself a 100 on this lab assignment for completing each area of the rubric.


public class CoinConverterBhatoya
{
   /*This is my main method where I call in the description and the conversion results.*/
   public static void main(String[] args)
   {
      description();
      convert();
   }
   
   /*Here is the introduction to the coin converting program.*/
   public static void description()
   {
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println("%           Welcome to the Coin Converter                                 %");
      System.out.println("%   I can convert the number of the pennies you have,                     %");
      System.out.println("%   to the number of dollar bill, quarters, dimes, nickels and pennies    %");
      System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
      System.out.println();
      System.out.println();
   }
   
   /*Most importantly, here is the part where I convert yuans to US currencies, coins to be specific.*/ 
   public static void convert()
   {
       int yuan = 1234;
       int pennies = (int)(yuan * .14 * 100);
       
       System.out.println("****************************************");
       System.out.println("Here is the result: "); 
       System.out.println(yuan + " Yuan is equivalent to " + pennies + " U.S pennies.");
       System.out.println(pennies + " pennies is equal to:");
       
       //pennies= 100 (1 dollar)
       int dollars = pennies/100;
       pennies = pennies%100;
       
       //quarters= 25/100
       int quarters = pennies/25;
       pennies = pennies%25;
       
       //dimes= 10/100
       int dime = pennies/10;
       pennies = pennies%10;
      
       //nickels= 5/100
       int nickel = pennies/5;
       pennies = pennies%5;
       
       System.out.println(dollars + " dollars");
       System.out.println(quarters + " quarters");
       System.out.println(dime + " dimes");
       System.out.println(nickel + " nickels");
       System.out.println(pennies + " pennies");    
       
  //Lastly, I created an output that displays the entire currencies. 
   }

}