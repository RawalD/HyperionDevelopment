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

public class errors //class and file name are case sensitive.
{
	public static void main (String[] args)
	{
	
		System.out.println("Welcome to my first program!\n"); //no semi colon. 
		System.out.println("\n");
		
		String ageStr  ="24"; //I'm 24 years old. Years cant be converted to integer. COMPILATION
		
		int age = Integer.parseInt(ageStr); //RUNTIME
		
		System.out.println("I'm " + age + " years old.");
		
		double three = 3.5; //integer cant be a string. Made whole number into a decimal number to add the 6 months as in half a year.
	
		
		double answerYears = age + three;  //I want an int, so I'm adding two ints. //LOGICAL
		
		System.out.println("Toal number of years: " + answerYears);
		
		double answerMonths = answerYears*12; 
		
		System.out.println("In 3 years and 6 months, I'll be " + answerMonths + " months old"); //LOGICAL
		
      //Misread instructions and completed before realising on stating type of errors. Thus had to go on memory what and where the issue was.
		//HINT, 330 months is the correct answer
	
	
	
	}

}


