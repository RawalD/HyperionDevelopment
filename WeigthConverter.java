import javax.swing.*;

public class WeigthConverter
{
   public static void main(String[]args)
   {
 
      int Choice = 0;
      int choice1 = 0;
      int choice2 = 0;
      int choice3 = 0;
      int choice4 = 0;
      int choice5 = 0;
      
      do
      {
      System.out.println("Which unit would you like to work with ?");
      
      Choice = Integer.parseInt( JOptionPane.showInputDialog("0. EXIT \n"+
                                                            "1. KILLOMETER \n" + 
                                                            " 2. METRE\n" +
                                                            " 3. CENTIMETRE\n" + 
                                                            " 4. MILLIMETRE\n" +
                                                            " 5. MICROMETRE\n"));
         if(Choice == 0){
            System.exit(0);
            break;
         }
      
      String number = JOptionPane.showInputDialog("Enter the amount");
      double num = Integer.parseInt(number);
                                                            
    switch( Choice )
     {
     case 1: 
      System.out.println("What Unit would you like to convert it to"); 
        choice1 = Integer.parseInt( JOptionPane.showInputDialog( "1. KILLOMETER \n" +
                                                               "2. METRE\n" +
                                                               "3. CENTIMETRE\n" + 
                                                               "4. MILLIMETRE\n" +
                                                               "5. MICROMETRE\n"
                                                               ));
                                                               
      //String number1 = JOptionPane.showInputDialog("Enter the Unit number");
      double num1 = Integer.parseInt(number);

   switch( choice1 )
    {
      case 1: System.out.println( num*1 + " KILLOMETER");
         break;
      case 2: System.out.println( num*1000 + " METRE ");
         break;
      case 3: System.out.println( num*100000 + " CENTIMETRE");
         break;
      case 4: System.out.println( num*1000000 + " MILLIMETRE");
         break;
      case 5: System.out.println( num*1000000000 + " MICROMETRE");
         break;
      }
      break;
    
     case 2:
      System.out.println("What Unit would you like to convert it to"); 
      choice1 = Integer.parseInt( JOptionPane.showInputDialog( "1. KILLOMETER \n" +
                                                            "2. METRE\n" +
                                                            "3. CENTIMETRE\n" + 
                                                            "4. MILLIMETRE\n" +
                                                            "5. MICROMETRE\n"
                                                            ));
     num1 = Integer.parseInt(number);                                                     
   
   switch( choice1 )
    {
      case 1: System.out.println( num/1000 + " KILLOMETER");
         break;
      case 2: System.out.println( num*1 + " METRE ");
         break;
      case 3: System.out.println( num/1000 + " CENTIMETRE");
         break;
      case 4: System.out.println( num*10000 + " MILLIMETRE");
         break;
      case 5: System.out.println( num*100000 + " MICROMETRE");
         break;
      }
      break;
   
     
    case 3:
     System.out.println("What Unit would you like to convert it to");
     choice1 = Integer.parseInt( JOptionPane.showInputDialog( "1. KILLOMETER \n" +
                                                            "2. METRE\n" +
                                                            "3. CENTIMETRE\n" + 
                                                            "4. MILLIMETRE\n" +
                                                            "5. MICROMETRE\n"
                                                            ));
   num1 = Integer.parseInt(number);
   
   switch( choice1 )
      {
      case 1: System.out.println( num/100000 + " KILLOMETER");
         break;
      case 2: System.out.println( num/100 + " METRE ");
         break;
      case 3: System.out.println( num*1 + " CENTIMETRE");
         break;
      case 4: System.out.println( num*10 + " MILLIMETRE");
         break;
      case 5: System.out.println( num*10000 + " MICROMETRE");
         break;
      }
      break;
      
    case 4:
     System.out.println("What Unit would you like to convert it to");
     choice1 = Integer.parseInt( JOptionPane.showInputDialog( "1. KILLOMETER \n" +
                                                            "2. METRE\n" +
                                                            "3. CENTIMETRE\n" + 
                                                            "4. MILLIMETRE\n" +
                                                            "5. MICROMETRE\n"
                                                            ));

      
    switch( choice1 )
      {
      case 1: System.out.println( num/100000 + " KILLOMETER");
         break;
      case 2: System.out.println( num/1000 + " METRE ");
         break;
      case 3: System.out.println( num/10 + " CENTIMETRE");
         break;
      case 4: System.out.println( num*1 + " MILLIMETRE");
         break;
      case 5: System.out.println( num*1000 + " MICROMETRE");
         break;
      }
      break; 
      
    case 5:
     System.out.println("What Unit would you like to convert it to");
     choice1 = Integer.parseInt( JOptionPane.showInputDialog( "1. KILLOMETER \n" +
                                                            "2. METRE\n" +
                                                            "3. CENTIMETRE\n" + 
                                                            "4. MILLIMETRE\n" +
                                                            "5. MICROMETRE\n"
                                                            ));

     switch( choice1 )
      {
      case 1: System.out.println( num/1000000 + " KILLOMETER");
         break;
      case 2: System.out.println( num/100000 + " METRE ");
         break;
      case 3: System.out.println( num/10000 + " CENTIMETRE");
         break;
      case 4: System.out.println( num/1000 + " MILLIMETRE");
         break;
      case 5: System.out.println( num*1 + " MICROMETRE");
         break;
      }
     
     }while(choice1 != 0);
      
   }while(Choice != 0);
   
   }
  }
 
