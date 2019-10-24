import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Deklarera alla variabler 
		
		int R1 = 0;
		int R2 = 0;
		int S = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		// Mata in R1 och S
		R1 = input.nextInt();
		S = input.nextInt();
		// Räknar ut R2
		R2 = 2 * S - R1;
		
		// Skriver ut R2
		System.out.println(R2);
	}

}
