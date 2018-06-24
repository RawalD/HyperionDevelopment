import javax.swing.*;

public class whiles //cant save as while
{
   public static void main (String [] args)
   {
      int counter = 0;
      int total = 0;     
      int num = 0;//This must be wrong but no idea what to apply the while condition to 
      
      while(num != -1){
      
        String response = JOptionPane.showInputDialog("Please enter number");
        num = Integer.parseInt(response);
        
        total += num;
        counter++;
        
        if(num == -1){
            counter--;
            total++;
            System.out.println("Your average is " + (total/counter));
            
          }
       
       /* if(num != -1){
	      total += num;
         counter++;
         } else {
         System.out.println("Your average is " + (total/counter));        
        }*/
                 
      }

     }
}