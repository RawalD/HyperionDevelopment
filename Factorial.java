public class Factorial{
    public static void main(String[]args)
      {
    
      int numbers[];
      numbers = new int[]{10,20,100,400,500,700,900,1000,1200,1300,1400,1500,1800};
      
      for(int i= 1; i < numbers.length; i++){ //make i = 0. Remember arrays are zero indexed so when you make i = 1,
                                              //it will skip the first element in the array i.e. 10
      
       System.out.println("Factors at " + numbers[i]);
       
       for(int j=1;j<=numbers[i];j++){ 
           if(numbers[i]%j == 0) {
           System.out.println(" " + j);             
        }
       } 
      }
     }
}
