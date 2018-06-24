public class operators
{
   public static void main (String [] args)
   {
 
 double numd = 30;
		 
		if ((numd/2)==50) //You can have an operation inside the condition
		{
			System.out.println("Numd must store the value 100, since 50 times 2 is equal to 100");
			
		}
		else if (numd > 100)	//Greater than operator
		{
			//You can have nothing happen inside an if statement, but this is bad programming style. 
         //This condition was met and thus the code block ends,no output was defined and so nothing to display.
		}
		else if (numd < 100) //Less than operator
		{
		  //Condition met ending code block ,no output given so nothing to display.
		}
		else if (numd != 25) //NOT EQUAL TO OPERATOR
		{
			System.out.println("I am certain numd does not store the value 25");
		}
		else if ( (numd%2)== 0) //MODULO OPERATOR. 
		{
			System.out.println("The value stored in numd is even because the remainder when it is divided by 2 is 0.");
		}
		
		

 
	   }
}