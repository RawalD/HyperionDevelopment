import javax.swing.*;

public class RomanToInt{
    public static String IntToRoman(int r){ //Function to deal with operation
        String roman = "";
        int convert;
        int number[] = {1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; //Numbers that match Roman Numerals
        String[] romans = {"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; 
  
        for(int x = 0; r > 0; x++){
            convert = r / number[x]; //Find position in array
            for(int i = 1; i <= convert; i++){
                roman += romans[x]; //Assign symbol
            }
            r = r % number[x]; 
        }
        return roman;
    }
 
    public static void main(String args[]){
    
        String input = JOptionPane.showInputDialog("Please enter a number");
        int parsedInt = Integer.parseInt(input);
 
        System.out.println(parsedInt + " in Roman Numerals : " + IntToRoman(parsedInt));
    }
}
