import javax.swing.*;

public class forloop2
{
      private static String password = "john";
   
   public static void main(String [] args)
   { 
    
   String input;
  // int counter = 0;// you can remove this line
   
   for(/*you will have to add "int" here*/int counter = 0; counter <= 3; counter++) {
      input = JOptionPane.showInputDialog("Please enter password");
      //counter++;
      
      if(input.equalsIgnoreCase(password)){
         System.out.println("Welcome");
         System.exit(0);
         
         } else if(counter == 3){
          counter = 0;
          System.out.println("Password was " + (password));
          changePassword();
          break;
         }
      } 
   } private static void changePassword(){
         
      boolean isPasswordValid = false;
            
       for(int i = 0; !isPasswordValid; i++){
             password = JOptionPane.showInputDialog("Please enter a new password");
      
         if(password.length() < 1 || password.length() > 20 ){
            System.out.println("Password must be more than 1 and less than 20 characters long.");
         
         } else if(password.charAt(0) == '_') {
            System.out.println("Password may start with an underscore or letter only");   
         
         } else if(password.equalsIgnoreCase(password) && Character.isLetter(0)) {
            System.out.println("Password may start with an underscore or letter only");
         
         }else {
            System.out.println("Password has been changed");
            isPasswordValid = true;
         
      }
    }
         System.exit(0);
  }
}
   