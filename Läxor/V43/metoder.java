package V43;

public class metoder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lol();
		System.out.println(max(3, 5));
		count(10);
		System.out.println(kelvin(10));
		System.out.println(celsius(100));
		ageControl(1010);
		stair(24);
	}

	public static void lol() {
		System.out.println("HAHAHAHAHAHAHA"); // Skriver ut texten.
	}

	public static int max(int tal1, int tal2) {

		if (tal1 >= tal2) { // Kollar ifall tal1 är större än tal2 och skickar tillbaka tal1 ifall det är sant.
			return tal1; 
		} 
		else { // Om det första är falsk skickar den tillbaka tal2.
			return tal2;
		}
	}

	public static void count(int n) {

		for (int i = 1; i <= n; i++) { // Skriver ut tills siffran n.
			System.out.println(i);
		}
	}

	public static double kelvin(double celsius) {

		return celsius + 273.15; // Räknar ut och skickar tillbaka i kelvin
	}

	public static double celsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8; // Räknar ut och skickar tillbaka i celsius
	}

	public static void ageControl(int age) {
		// Kollar vilket villkor som stämmer. 
		if (age <= 5) {
			System.out.println("Småbarn får inte göra något.");
		} 
		else if (age <= 12) {
			System.out.println("Du får spela Fortnite.");
		} 
		else if (age <= 14) {
			System.out.println("Du är tonåring.");
		} 
		else if (age <= 17) {
			System.out.println("Du får köra moppe.");
		} 
		else if (age <= 20) {
			System.out.println("Du får köra bil.");
		} 
		else if (age <= 64) {
			System.out.println("Du får vuxenstraff om du gör något dumt.");
		} 
		else if (age <= 99) {
			System.out.println("Du är pensionär.");
		}
		else {
			System.out.println("R.I.P?");
		}
	}

	public static void stair(int steps) {

		for (int i = 1; i <= steps; i++) { //Skriver ut antalet rader.

			for (int j = 0; j < steps - i; j++) { // Skriver ut antalet tomrum.
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) { // Skriver ut antalet X.
				System.out.print("X");
			}
			System.out.print("\n"); // Skriver ut X på ny rad.
		}

	}
}
