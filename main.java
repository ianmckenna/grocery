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
		System.out.println("Let me write that to file");
		Ingredient ingr1 = new Ingredient(ing1, numIng);
		System.out.println(ingr1.name + " " +ingr1.quantity);
		}
		catch(Exception e)
			{
				System.out.println("Don't do that shit Geoff...");
			}
	}
}


