import java.util.*;
import javax.swing.*;

public class do_whileMenue
{
   public static void main(String[]args)
   {
   int choice;
   do
   {
      System.out.println("Please select an application to start using the corresponding number");
      choice = Integer.parseInt(JOptionPane.showInputDialog("Select\n"+
                                                           "1. Task 3.java\n"+
                                                           "2. Errors.java\n"+
                                                           "3. Whiles.java\n"+
                                                           "4. Do While Password.java\n"+
                                                           "5. Quit"));
      switch( choice )
      {
        case 1: part3.main(null);
               break;
        case 2: errors.main(null); 
               break;      
        case 3: whiles.main(null);
               break;
        case 4: whilePassword.main(null);
               break;
          
         default:System.out.println("Please select a valid option from the list or 5 to quit");
               break;
         } 
      }while(choice != 5);
   }
}