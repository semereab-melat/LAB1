package LAB1;
import java.util.Scanner;

/***************************************************************
 Filename: 
 Created by: Melat
 Created on: 10/4/2021
 Comment: 
 ***************************************************************/

public class Test1Mistaken
{
   public static void main(String[] args)
   {

      Scanner keyboard = new Scanner(System.in);
      String name,last, capital1, capital;
      System.out.print("Enter your name: ");
      name = keyboard.nextLine();
      System.out.print("Enter your last: ");
      last =  keyboard.nextLine();
      capital1 = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
      capital = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
      System.out.println(capital1 + " " + capital);


   }
}