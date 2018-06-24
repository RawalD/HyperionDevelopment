import java.util.Scanner;

public class logic {
  public static void main(String[] args) {
  // Write your code here
   Scanner in = new Scanner (System.in);
    
    int num = in.nextInt();
    int i = 0;
    
    System.out.println("Please enter number");
    
    while(i <= 10){
      System.out.println(num + "x" + (i+1) + "=" + (num*i));
      i++;  
    }
 }
}