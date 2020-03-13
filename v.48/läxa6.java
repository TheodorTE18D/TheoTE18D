import java.util.Scanner;

public class läxa6 {
	static int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4,
			3, 2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
			5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

	static String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
			"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
			"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola", "Margie",
			"Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney", "Diana",
			"Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami", "Lashanda",
			"Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee", "Yael", "Kelle",
			"Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady", "Rigoberto", "Felicia",
			"Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela", "Ophelia", "Alesha",
			"Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin", "Emmie", "Mickie",
			"Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * one(); two();  four(); five(); six(); seven(); eight();
		 
		nine();*/
		three();
	}

	static Scanner input = new Scanner(System.in);

	public static void one() {

		int amount = input.nextInt();
		int nmrAmount = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == amount) {
				nmrAmount = nmrAmount + 1;
			}
		}
		System.out.println(nmrAmount);
	}

	public static void two() {
		
		  String name = input.nextLine();
		 
		int nameAmount = 0;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contentEquals(name)) {
				nameAmount = nameAmount + 1;
			}
		}
		System.out.println(nameAmount);

	}

	public static void three() {
		int[] numberOf = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int min = 100;
		int max = 0;
		for (int i = 0; i < 10; i++) {

			for (int k = 0; k < numbers.length; k++) {

				if (numbers[k] == i) {
					numberOf[i] += 1;
				}

			}
			if (numberOf[i] > max) {
				max = numberOf[i];
			}
			if (numberOf[i] < min) {
				min = numberOf[i];
			}
		}
		for(int i = 0; i < 10; i++) {
		
			if (max == numberOf[i]) {
				System.out.println(i + " är det talet det finns flest av.");
			}
			if (min == numberOf[i]) {
				System.out.println(i + " är det talet det finns minst av.");
			}
		}
	}

	public static void four() {
		int index = 0;
		;
		for (int i = 0; i < names.length; i++) {
			if (names[i].contentEquals("Drusilla")) {
				index = i;
				break;
			}

		}
		System.out.println(index);

	}

	public static void five() {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] % 2 == 0) {
				sum = sum + numbers[i];
			}

		}
		System.out.println(sum);
	}

	public static void six() {

		int amount0 = 0;
		int amount1 = 0;
		int amount2 = 0;
		int amount3 = 0;
		int amount4 = 0;
		int amount5 = 0;
		int amount6 = 0;
		int amount7 = 0;
		int amount8 = 0;
		int amount9 = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == 0) {
				amount0 = amount0 + 1;
			}
			if (numbers[i] == 1) {
				amount1 = amount1 + 1;
			}
			if (numbers[i] == 2) {
				amount2 = amount2 + 1;
			}
			if (numbers[i] == 3) {
				amount3 = amount3 + 1;

			}
			if (numbers[i] == 4) {
				amount4 = amount4 + 1;

			}
			if (numbers[i] == 5) {
				amount5 = amount5 + 1;

			}
			if (numbers[i] == 6) {
				amount6 = amount6 + 1;

			}
			if (numbers[i] == 7) {
				amount7 = amount7 + 1;

			}
			if (numbers[i] == 8) {
				amount8 = amount8 + 1;

			}
			if (numbers[i] == 9) {
				amount9 = amount9 + 1;

			}
		}

		System.out.println("Det finns " + amount0 + " 0:or finns det");
		System.out.println("Det finns " + amount1 + " 1:or finns det");
		System.out.println("Det finns " + amount2 + " 2:or finns det");
		System.out.println("Det finns " + amount3 + " 3:or finns det");
		System.out.println("Det finns " + amount4 + " 4:or finns det");
		System.out.println("Det finns " + amount5 + " 5:or finns det");
		System.out.println("Det finns " + amount6 + " 6:or finns det");
		System.out.println("Det finns " + amount7 + " 7:or finns det");
		System.out.println("Det finns " + amount8 + " 8:or finns det");
		System.out.println("Det finns " + amount9 + " 9:or finns det");

	}

	public static void seven() {

		int lAmount = 0;
		for (int i = 0; i < names.length; i++) {

			if (names[i].startsWith("L")) {

				lAmount = lAmount + 1;
			}
		}
		System.out.println(lAmount);
	}

	public static void eight() {

		int lengthAmount = 0;
		for (int i = 0; i < names.length; i++) {

			if (names[i].length() == 5) {

				lengthAmount = lengthAmount + 1;
			}

		}
		System.out.println(lengthAmount);
	}

	public static void nine() {

		int uniqueNames = 0;
		for (int i = 0; i < names.length; i++) {
			boolean unik = true;
			for (int k = 0; k < names.length; k++) {

				if ((names[i].contentEquals(names[k])) && (i != k)) {
					unik = false;
					break;
				}

			}
			if (unik) {
				uniqueNames += 1;
			}
		}
		System.out.println(uniqueNames);
	}

}
