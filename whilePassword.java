import javax.swing.*;

public class whilePassword
{
      private static String password = "john";
   
   public static void main(String [] args)
   { 
    
   String input;
   int counter = 0;
   
   do{
      input = JOptionPane.showInputDialog("Please enter password");
      counter++;
      
      if(input.equalsIgnoreCase(password)){
         System.out.println("Welcome");
         System.exit(0);
         
         } else if(counter == 3){
          counter = 0;
          System.out.println("Password was " + (password));
          changePassword();
          
         }
         
      }while(!input.equals(password)); //while(counter <= 3); This is not exactly correct, although it's not causing any problems. 
                                           
      
   } private static void changePassword() {
         
      boolean isPasswordValid = false;
            
       while(!isPasswordValid) {
             password = JOptionPane.showInputDialog("Please enter a new password");
      
         if (password.length() < 1 || password.length() > 20 ) {
            System.out.println("Password must be more than 1 and less than 20 characters long.");
         
         } else if (password.charAt(0) != '_') {
            
               if(!Character.isLetter(password.charAt(0))) 
               System.out.println("Password may start with an underscore or letter only"); 
 
         }
            else
               System.out.println("Password has been changed");
               isPasswordValid = true;   
       }    
    }
  }   
   