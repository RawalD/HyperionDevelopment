import java.util.Arrays; //To get the arrays to display ,was getting [I@424c0bc4 , [I@3c679bde.

public class Rebel
{
   public static void main(String[]args)
   {
 
      int[] number = {1,2,3,4,5};
            
      String[] words = {"6","7","8","9","10"};
      
      int[] intArray = new int[words.length]; //Couldnt find an understandable solution to swap arrays of different value.
      
      for (int i = 0; i < words.length; i++) {
      
         String numberAsString = words[i];
         intArray[i] = Integer.parseInt(numberAsString);
      
      }
          
      for (int i = 0; i < number.length ; i++) { //Swap arrays
           
          number[i] = number[i] + intArray[i];
          intArray[i] = number[i] - intArray[i];
          number[i] = number[i] - intArray[i];
      } 
      
      for (int j = 0; j < number.length; j++) { //Multiply by 4
      
          number[j] = number[j]*4;
          System.out.println(number[j]);
      
      }
   
      for (int k = 0; k < intArray.length ; k++) { //Multiply by 3
      
          intArray[k] = intArray[k]*3;
          System.out.println(intArray[k]);
      
      }
      
      System.out.println(Arrays.toString(number));
      System.out.println(Arrays.toString(intArray));
   
      for (int i = 0; i < number.length ; i+=2) { //Swap at even positions
            
          number[i] = number[i] + intArray[i];
          intArray[i] = number[i] - intArray[i];
          number[i] = number[i] - intArray[i];
      
        } 
   
   
      System.out.println(Arrays.toString(number));
      System.out.println(Arrays.toString(intArray));
      
      for(int l = 0; l < number.length;l++){
         
           if(number[l] < 40){
           System.out.println("In Numbers array " + intArray[l]);
           
           }
         }
         
         for(int m = 0; m < intArray.length; m++) {
         
           if(intArray[m] < 40){
           System.out.println("Numbers in Words/intArray array " + intArray[m]);
           
           }  
         }
         System.out.println(Arrays.toString(number));
         for(int n = 0; n < number.length; n++){   //you can use intArray.length here because it's the same size as the number array, but I would use 
                                                   //number.length instead because you are working with the number array first
                                                   
           System.out.println("Divisor positions of " + number[n] + " in the numbers array"); // I added this to give you an example of how you should separate
                                                                                              // Sections to make it easier to read
            
            for(int p = 0; p < number.length; p++){/*change to p < number.length */
              
               if(number[n] % number[p] == 0){ 
                  System.out.println(p + " ");  
              }
            }
            
          System.out.println(Arrays.toString(intArray));
          
            for(int q = 0; q < intArray.length; q++){
               
               System.out.println("Divisor positions of " + intArray[q] + " in the intArray");
               
               for(int r = 0; r < intArray.length; r++) {
                  
                  if(intArray[q] % intArray[r] == 0){
                     System.out.println(r + " ");                  
                  }
               }
            }
            
            //create another nested for loop here to check for divisors in the intArray for each number in the number array
        
         }
         
        
   
   }
}