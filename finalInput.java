import javax.swing.*;

public class finalInput 
{
   public static void main (String [] args)
   {

//String response = "Dip";
   
   String response = JOptionPane.showInputDialog("What is your name?");
 

   if(response.equalsIgnoreCase("Dip")) {
   
   System.out.println("Hello there " + response);
   
   } else if (response.equalsIgnoreCase("Ben")) {
   System.out.println("Welcome back " + response);
   
   } else {
   System.out.println("Hello there stranger");
   }
   
   
   }
}