/**
 * 
 */
import java.util.Scanner;
/**
 * @author oracle
 *
 */

		
		

		public class AskingQuestions 
		{ 
		  public static void main( String[] args ) 
		  { 
		    Scanner keyboard = new Scanner(System.in);

		   //int num1, num2, num3;
		    double num1, num2, num3;

		    System.out.print( "First temperature? " );
		    //num1 = keyboard.nextInt();
		    num1 = keyboard.nextDouble();

		    System.out.print( "Second temperature? " );
		    //num2 = keyboard.nextInt();
		    num2 = keyboard.nextDouble();

		   // System.out.println("The max value is : " + Math.max(num1, num2));
		    num3 = (num1 + num2)/2; 

		    System.out.println("The average value is : " + num3 );
		  }
		
	

	}


