import java.util.Scanner;

public class Lektion3 {
 
	public static void main(String[] args) {
	
	// villkor
	
		boolean again = true;
		int age = 0; 
	
		Scanner input = new Scanner(System.in); // gör det möjligt att få input från konsollen
	
	
		
		System.out.println("hur gammal är du?");
		age = input.nextInt();
	
		if (age >= 18) { 
			System.out.println("Du är gammal nog att köra bil! Grattis din jävel!");
			System.out.println("Bara så du vet så får du åka moppe också!");
	
		}
		else if (age >= 15 && age < 18) {
			System.out.println("Du är för ung för att köra bil men du får köra moppe!");
		}
		else {
			System.out.println("Tyvärr, du får vänta");
		}
		
		
	}
	
	
}
