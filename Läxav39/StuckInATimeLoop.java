import java.util.Scanner;

public class StuckInATimeLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Deklarera variabel
		
		int n = 0;
		
		Scanner input = new Scanner(System.in);
		
		// Läsa in n
		
		n = input.nextInt();
		
		// Loopa igenom n gånger
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " Abracadabra");
		}
	}

}
