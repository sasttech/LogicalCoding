package LogicalCoding;
import java.util.Scanner;
public class CommandLineArg
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter any stdent  marks");
		int marks = sc.nextInt(); //take marks as command line argument.
		switch(marks/10)
		{
			case 10:
			case 9:
			case 8:
			System.out.println("Excellent");
				break;
			case 7:
			System.out.println("Very Good");
			break;
			case 6:
			System.out.println("Good");
			break;
			case 5:
			System.out.println("Work Hard");
			break;
			case 4:
			System.out.println("Poor");
			break;
			case 3:
			case 2:
			case 1:
			case 0:
			System.out.println("Very Poor");
			break;
			default:
			System.out.println("Invalid value Entered");
		}
	}
}