import javax.swing.*;

public class forloop

{
   public static void main(String [] args)
   {
 
   int counter = 0;
   int total = 0;
   int num = 0;
  
   
   for(num = 0;num != -1;total+=num){ //num initialised at, condition to meet -1, assignment / incrementing rule.
       String response = JOptionPane.showInputDialog("Please enter number");
       num = Integer.parseInt(response);
       counter++; //counter++ only one left same
            
      if(num == -1) { //break statement added to if statement.
      
         counter--;
         total++;
         System.out.println("Your average is " + (total/counter));
         break;
        }
      
      }
   }
}