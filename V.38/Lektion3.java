import java.util.Scanner;

public class Lektion3 {
 
	public static void main(String[] args) {
	
	// villkor
	
		boolean again = true;
		int age = 0; 
	
		Scanner input = new Scanner(System.in); // g�r det m�jligt att f� input fr�n konsollen
	
	
		
		System.out.println("hur gammal �r du?");
		age = input.nextInt();
	
		if (age >= 18) { 
			System.out.println("Du �r gammal nog att k�ra bil! Grattis din j�vel!");
			System.out.println("Bara s� du vet s� f�r du �ka moppe ocks�!");
	
		}
		else if (age >= 15 && age < 18) {
			System.out.println("Du �r f�r ung f�r att k�ra bil men du f�r k�ra moppe!");
		}
		else {
			System.out.println("Tyv�rr, du f�r v�nta");
		}
		
		
	}
	
	
}
