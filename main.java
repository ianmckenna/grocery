import java.util.Scanner;
import java.awt.*;
import java.io.*;
public class main{
	public static void main(String[] geoffStayOffMyLawn) throws IOException {
		int cont = 1;
		File file = new File("/home/greg/workspace/Pantry/src/pantry.txt");
	    FileWriter fWriter = new FileWriter (file,true);
	    PrintWriter pWriter = new PrintWriter (fWriter);
		if (file.exists() == true) {
			System.out.println("File is good!");
		}
		else {
			System.out.println("NO FILE");
		}
		Scanner fileInput = new Scanner(file);
		
		
			
		try(Scanner sc = new Scanner(System.in)){
			while (cont == 1){
		System.out.println("What do you want to do? Enter a number to get started.");	
		System.out.println("1. Add an ingredient");	
		System.out.println("2. Remove an ingredient");	
		System.out.println("3. Print ingredient");	
		System.out.println("4. Do I have x?");	
		int inp =sc.nextInt();
		if (inp ==1)
			{
			
			System.out.println("Let's make an ingredient!");
			System.out.println("What's the ingredient's name?");
			String ing1 = sc.next();
			System.out.println("How many are there?");
			int numIng = sc.nextInt();
			System.out.println("So you have "+numIng+" "+ing1+"s?");
			System.out.println("Let me write that to file");
			Ingredient ingr1 = new Ingredient(ing1, numIng);
			System.out.println(ingr1.name + " " +ingr1.quantity);
			fWriter.write("\n"+ingr1.name);
			fWriter.flush();
			}
				else if (inp == 2){
					System.out.println("We don't support that yet");
					}
		
				else if(inp==3) {
					System.out.println("Here are the ingredients you have");
					while (fileInput.hasNextLine()){
						System.out.println(fileInput.nextLine());
					}
		
					}
				else if (inp == 4){
					System.out.println("We don't support that yet");
					}
				else{
					
					System.out.println("That's not an option");
					
					}
		
		System.out.println("Do you want to continue? 1 = yes 2 = no");
		cont = sc.nextInt();
			}
		}
		catch(Exception e)
			{
				System.out.println("Don't do that shit Geoff...");
			}
		
		fWriter.close();
	}

}


