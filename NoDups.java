import java.util.Arrays;  

public class NoDups
{  

public static int removeDup(int arr[], int n)
{  

        int[] temp = new int[n];  
        int j = 0;  
        
        for (int i = 0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  

        temp[j++] = arr[n-1];     
 
        for (int i = 0; i < j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  
       
    public static void main (String[] args) 
    {  
        int arr[] = {20, 100, 10, 80, 70, 1, 0, -1, 2, 10, 15, 300, 7, 6, 2, 18, 19, 21, 9, 0};
        Arrays.sort(arr); 
        
        System.out.println("Before method");
        
        System.out.println(Arrays.toString(arr));
        
        System.out.println("After method");
        
        int length = arr.length;  
        length = removeDup(arr, length);   
    
        for (int i = 0; i < length; i++)  
           System.out.print(arr[i] + " ");  
    }  
}  