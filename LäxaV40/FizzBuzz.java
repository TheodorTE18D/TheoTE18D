import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Deklarerar och skriver in variablarna
		int x = input.nextInt(); 
		int y = input.nextInt();
		int n = input.nextInt();
		
		// Kollar alla nummrer
		for (int i = 1; i <= n; i++) {
			
			// Använder boolean för att slippa göra beräkningar flera gånger
			boolean printfizz = false;
			boolean printbuzz = false;
			
			
			// Kollar om vi ska skriva ut Fizz
			if (i % x == 0) {
				
				printfizz = true;
				
			}
			
			// Kollar om vi ska skriva ut Buzz
			if (i % y == 0) {
				
				printbuzz = true;
				
			}
			
			// Skriv ut resultatet
			if (printfizz & printbuzz) {
				System.out.println("FizzBuzz");
				
			}
			
			else if (printfizz){
				System.out.println("Fizz");
			
			}
			else if (printbuzz) {
				System.out.println("Buzz");
			}
			// Om vi varken skrivit ut Fizz eller Buzz skriver vi ut siffran
			else {
				System.out.println(i);
			}
		}
	}

}
