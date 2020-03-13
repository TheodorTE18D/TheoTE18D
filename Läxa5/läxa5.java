
public class läxa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lol();
		// System.out.println(max(12, 10));
		// count(10);
		// System.out.println(kelvin(300));
		// System.out.println(fahrenheit(100));
		// ageControl(10000);
		stair(1000);
	}

	public static void lol() {
		System.out.println("HAHAHAHAHA");
	}

	public static int max(int a, int b) {

		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}

	public static void count(int n) {

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	public static double kelvin(double kelvin) {

		return kelvin - 273.15;
	}

	public static double fahrenheit(double fahrenheit) {

		return (fahrenheit - 32) / 1.8;
	}

	public static void ageControl(int age) {

		if (age <= 5) {
			System.out.println("Småbarn får inte göra något.");
		} else if (age <= 12) {
			System.out.println("Du får spela Fortnite.");
		} else if (age <= 14) {
			System.out.println("Du är tonåring.");
		} else if (age <= 17) {
			System.out.println("Du får köra moppe.");
		} else if (age <= 20) {
			System.out.println("Du får köra bil.");
		} else if (age <= 64) {
			System.out.println("Du får vuxenstraff om du gör något dumt.");
		} else if (age <= 99) {
			System.out.println("Du är pensionär.");
		} else {
			System.out.println("R.I.P?");
		}
	}

	public static void stair(int steps) {

		for (int i = 1; i <= steps; i++) {

			for (int j = 0; j < steps - i; j++) {
				System.out.print(" ");
			
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("X");
			
			}
			
			System.out.print("\n");
		}
	}
}
