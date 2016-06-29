import java.util.Scanner;
import java.awt.*;
public class main{
	public static void main(String[] geoffStayOffMyLawn) {
		
		
		try(Scanner sc = new Scanner(System.in)){
			
		System.out.println("What's your name?");
		String x = sc.next();
		System.out.println("Hi "+x+"!");
		System.out.println("Let's make an ingredient!");
		System.out.println("What's the ingredient's name?");
		String ing1 = sc.next();
		System.out.println("How many are there?");
		int numIng = sc.nextInt();
		System.out.println("So you have "+numIng+" "+ing1+"s?");

		
		}
		catch(Exception e)
			{
				System.out.println("Don't do that shit Geoff...");
			}
	}
}


