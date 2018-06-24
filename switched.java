import javax.swing.*;
public class switched
{
   public static void main(String[]args)
   {
   
   String input = JOptionPane.showInputDialog("Please enter a number from 0 to 99");
   int convertInt = Integer.parseInt(input);
   
   int one = convertInt%10;
   int two = convertInt/10;
   
   if(convertInt == 0) {
      System.out.print("zero");
   }
   
   if((convertInt >10) && (convertInt<20)){ 
      switch(convertInt)
      {
      
      case 11: System.out.print("Eleven");
      break;
      case 12: System.out.print("Twelve");
      break;
      case 13: System.out.print("Thirteen");
      break;
      case 14: System.out.print("Fourteen");
      break;
      case 15: System.out.print("Fifteen");
      break;
      case 16: System.out.print("Sixteen");
      break;
      case 17: System.out.print("Seventeen");
      break;
      case 18: System.out.print("Eighteen");
      break;
      case 19: System.out.print("Nineteen");
      break;
          
      }
       System.exit(0); 
     } 
   
   if((one <= 9) && (two <= 99)) 
   {
   switch(two)
     {
      case 1: System.out.print("Ten");
      break;
      case 2 : System.out.print("Twenty ");
      break;
      case 3 : System.out.print("Thirty ");
      break;
      case 4 : System.out.print("Forty ");
      break;
      case 5 : System.out.print("Fifty ");
      break;
      case 6 : System.out.print("Sixty ");
      break;
      case 7 : System.out.print("Seventy ");
      break;
      case 8 : System.out.print("Eighty ");
      break;
      case 9 : System.out.print("Ninety ");
      break;
      
      default: System.out.print("Number Not Valid");
   
      }
      
          
   switch(one)
     {
      case 0: System.out.println("");
      break;
      case 1: System.out.println("One");
      break;
      case 2: System.out.println("Two");
      break;
      case 3: System.out.println("Three");
      break; 
      case 4: System.out.println("Four");
      break;
      case 5: System.out.println("Five");
      break;
      case 6: System.out.println("Six");
      break;
      case 7: System.out.println("Seven");
      break;
      case 8: System.out.println("Eight");
      break;
      case 9: System.out.println("Nine");
      break;

      default: System.out.println("Number not in range");
      }
  
      } 
   }
}