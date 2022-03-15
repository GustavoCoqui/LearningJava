package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input a binary number:");
		String myDecimalNumber = sc.nextLine();
		
		int myBynariNumber = Integer.parseInt(myDecimalNumber,2);
		
		String myOctalNumber = Integer.toOctalString(myBynariNumber);
		
		System.out.println("The octal number is: "+ myOctalNumber);
		
		sc.close();


	}

}
