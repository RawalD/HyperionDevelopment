import javax.swing.*;

public class SwitchEnhanced
{
   public static void main(String[]args)
   {
 
   String input = JOptionPane.showInputDialog("Enter number");
   int convert = Integer.parseInt(input);
   
   
   int thousand = (convert/1000)%10;
   int hundred = (convert/100) % 10; //mod
   int tens = (convert / 10) % 10;//mod
   int ones = convert%10;
   int centsTens = (convert/10000) % 10;
   
   
   String thousands = " Thousand";
   String hundreds = " Hundred";
   
   
   String zar = " Rand ";
   
   if(( convert <= 10000 ) && (convert >= 0)){
    
      switch(thousand)
      {
         
         case 1: System.out.print(" One" + thousands);
         break;
         case 2: System.out.print(" Two" + thousands);
         break;
         case 3: System.out.print(" Three" + thousands);
         break;
         case 4: System.out.print(" Four" + thousands);
         break;
         case 5: System.out.print(" Five" + thousands);
         break;
         case 6: System.out.print(" Six" + thousands);
         break;
         case 7: System.out.print(" Seven" + thousands);
         break;
         case 8: System.out.print(" Eight" + thousands);
         break;
         case 9: System.out.print(" Nine" + thousands);
         break;
         case 10: System.out.print(" Ten" + thousands);
         break;
      }
      
     switch(hundred) 
      {
      case 1: System.out.print( " One" + hundreds);
      break;
      case 2: System.out.print(" Two" + hundreds);
      break;
      case 3: System.out.print(" Three" + hundreds);
      break;
      case 4: System.out.print(" Four" + hundreds);
      break;
      case 5: System.out.print(" Five" + hundreds);
      break;
      case 6: System.out.print(" Six" + hundreds);
      break;
      case 7: System.out.print(" Seven" + hundreds);
      break;
      case 8: System.out.print(" Eight" + hundreds);
      break;
      case 9: System.out.print(" Nine" + hundreds);
      break;
      }
     
     
    switch(tens)
      {
      
         case 1: System.out.print(" Ten ");
         break;
         case 2: System.out.print(" Twenty ");
         break;
         case 3: System.out.print(" Thirty ");
         break;
         case 4: System.out.print(" Forty ");
         break;
         case 5: System.out.print(" Fifty ");
         break;
         case 6: System.out.print(" Sixty ");
         break;
         case 7: System.out.print(" Seventy ");
         break;
         case 8: System.out.print(" Eighty ");
         break;
         case 9: System.out.print(" Ninety ");
         break;
      
      }
      
      switch(ones)
      {
         case 0: System.out.print(zar);
         break;
         case 1: System.out.print("One" + zar);
         break;
         case 2: System.out.print("Two" + zar);
         break;
         case 3: System.out.print("Three " + zar);
         break;
         case 4: System.out.print("Four" + zar);
         break;
         case 5: System.out.print("Five" + zar);
         break;
         case 6: System.out.print("Six" + zar);
         break;
         case 7: System.out.print("Seven" + zar);
         break;
         case 8: System.out.print("Eight" + zar);
         break;
         case 9: System.out.print("Nine" + zar);
         break;
      }
      switch(centsTens)
      {
         case 1: System.out.println("Ten cents");
         break;
         case 2: System.out.println("Twenty cents");
         break;
         case 3: System.out.println("Thirty cents");
         break;
         case 4: System.out.println("Forty cents");
         break;
         case 5: System.out.println("Fifty cents");
         break;
         case 6: System.out.println("Sixty cents");
         break;
         case 7: System.out.println("Seventy cents");
         break;
         case 8: System.out.println("Eighty cents");
         break;
         case 9: System.out.println("Ninety cents");
         break;
      }//Yet to add cents
    }
   }
}