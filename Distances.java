import javax.swing.*;
import java.util.Arrays;

public class Distances
{
   public static void main(String[]args)
   {
 
   int centralPoint = 100;

   int[] distance  = {centralPoint+50,centralPoint+150,centralPoint+95,centralPoint+56,centralPoint+210,centralPoint+77,centralPoint+67,centralPoint+99,
                       centralPoint+153,centralPoint+23, };
   
                       
   int choiceOne = 0;
   int choiceTwo = 0;
   int cityDistance1 = 0;
   int cityDistance2 = 0;
   
   
   do
   {
   System.out.println("Please select 2 cities to calculate distances");
   choiceOne = Integer.parseInt(JOptionPane.showInputDialog("Select\n"+
                                                            "0. Exit  \n " +
                                                            "1.  FunctionVille   \n " + 
                                                            "2.  StringCity  \n "+
                                                            "3.  ObjectVille \n "+
                                                            "4.  FunctionTown \n "+
                                                            "5.  Intercity \n "+
                                                            "6.  Boolean Port \n "+
                                                            "7.  Voidentia \n "+
                                                            "8.  ClassStation \n "+
                                                            "9.  Arraysbury \n "+
                                                            "10. HypeCity"));
                                                            
   switch(choiceOne)
      { 
      case 0: System.exit(0);
         break;
      case 1: cityDistance1 = distance[choiceOne];
         break;
      case 2: cityDistance1 = distance[choiceOne];
         break;
       case 3: cityDistance1 = distance[choiceOne];
         break;
      case 4: cityDistance1 = distance[choiceOne];
         break;
      case 5: cityDistance1 = distance[choiceOne];
         break;
      case 6: cityDistance1 = distance[choiceOne];
         break;
      case 7: cityDistance1 = distance[choiceOne];
         break;
      case 8: cityDistance1 = distance[choiceOne];
         break;
      case 9: cityDistance1 = distance[choiceOne];
         break;
      case 10: cityDistance1 = distance[choiceOne];
         break;
         }
   
   choiceTwo = Integer.parseInt(JOptionPane.showInputDialog("Select\n"+
                                                            "1.  FunctionVille   \n " + 
                                                            "2.  StringCity  \n "+
                                                            "3.  ObjectVille \n "+
                                                            "4.  FunctionTown \n "+
                                                            "5.  Intercity \n "+
                                                            "6.  Boolean Port \n "+
                                                            "7.  Voidentia \n "+
                                                            "8.  ClassStation \n "+
                                                            "9.  Arraysbury \n "+
                                                            "10. HypeCity"));
   
   
   
     switch (choiceTwo)
      {
       
      case 1: cityDistance2 = distance[choiceTwo];
         break;
      case 2: cityDistance2 = distance[choiceTwo];
         break;
       case 3: cityDistance2 = distance[choiceTwo];
         break;
      case 4: cityDistance2 = distance[choiceTwo];
         break;
      case 5: cityDistance2 = distance[choiceTwo];
         break;
      case 6: cityDistance2 = distance[choiceTwo];
         break;
      case 7: cityDistance2 = distance[choiceTwo];
         break;
      case 8: cityDistance2 = distance[choiceTwo];
         break;
      case 9: cityDistance2 = distance[choiceTwo];
         break;
      case 10: cityDistance2 = distance[choiceTwo];
         break;
       }
                                              
   
   System.out.println("The distance is : " + (cityDistance1 + cityDistance2) + " km");  
      
   
   }while(choiceOne != 0);
   
   }
}