import javax.swing.*;

public class whiles2 //cant save as while
{
   public static void main (String [] args)
   {
      int counter = 0;
      int total = 0;     
      int num = 0;
      String user = "joe";
      String userName = "";
            //user = userName;
      
      
      while(!userName.equals(user)){
          userName = JOptionPane.showInputDialog("Please enter your name");
          System.out.println("User not permitted");
         
      } 
      
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
        if(num == 0){
            System.out.println("Sorry not valid"); 
            break;        
          }    
    
        }  
   System.out.println(counter); 
   }
}