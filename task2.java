/* --- Opening this file --- 

Please do not open this file in the wrong program such as Notepad or Notepad++.
For our Java course, all files should be opened in the program JGRASP. 
  
** Double check that both JGrasp and Java are installed on your computer as per the instructions in the Welcome document **

To do this, run JGRASP from your computer where it should be installed. Double click the JGrasp icon on your Desktop to run JGRASP.
In the top left corner of JGRASP, click File->Open
Navigate to this .java file inside your Dropbox folder on your computer (usually under C:/Users/YourUsername/Dropbox/YourDropboxFolderName/Task 1/example.java)
Double click on example.java and it will open in JGRASP. 
You may now continue reading the rest of this file.

*/


/* ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************
*/


	/*========================================================= Compulsory TASK 2 =======================================================

		  It's now time for you to make your own program. 
		  We've already created the structure of the program for you to help you out.
		  You should already have this file open in JGrasp
        
		  Complete the following excercise in the sapce provided below
	
		  Using examples shown in the example program, write code in the place indicated below to do the following:
		   
			  Create four variables, using the appropriate data type (String, double, int or char) and have them store:
			   - Your first name
			   - Your age
			   - Your approximate height in centimeters (decimal)
			   - Your favourite whole number
			 
		  Output this data on separate lines with a tabbed spacing (eg: First name:      Joe)
		  You'll need to use 4 separate System.out.println statements to do this, each adding your variable to a String to outprint them.
		  
		  Don't forget to compile and run your code to test the output. 
			  
		 If you need any help, be sure to let the teachers know by sending an email to help@hyperiondev.com or by leaving a message in your Dropbox.  
		 
		 If your code is correct, you'll get to move on to Task 3. Good luck!

		======================================================================================================================================
		   
	  
	   ================================================== Optional Task 2 =================================================================
	  
	 	Add to your program above by changing your first name to your full name, with correct formatting. 
		Add 5 years to your age using the add operator.
		Divide your favourite number by 3. Outprint your number and briefly explain in a comment what was the expected result, why the result is wrong, and how this could be fixed.
	  
	  
	  
	  */
    

//    INSERT YOUR CODE BELOW THIS STATEMENT
public class task2
 {
 
   public static void main (String [] args)
   {
    
   String name = "Dip";
   int age = 24;
   double height = 1.75;
   int favNum = 16;

System.out.println("First Name:\t" + name);
System.out.println("Age:\t" + age);
System.out.println("Height:\t" + height + "m"); //Didnt make sense to me to use cm if im using decimal so opted for meters as it would make use of thr decimal.
System.out.println("Favourite Number:\t" + favNum);

name = "Dip Rawal";
age += 5;
favNum /= 3;

System.out.println("First Name:\t" + name);
System.out.println("Age:\t" + age);
System.out.println("Height:\t" + height + "m"); //Didnt make sense to me to use cm if im using decimal so opted for meters as it would make use of thr decimal.
System.out.println("Favourite Number:\t" + favNum);
/* Expected 5.33 but since the data value is set to integer it can only return a rounded off whole number thus 5. 
   To resolve the int should have been a double :
   
   double age = 16;
   age /= 3;
  */ 

   }
 }
