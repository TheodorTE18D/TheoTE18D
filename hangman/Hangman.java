import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Hangman {

	static Scanner input = new Scanner(System.in);
	static String[] easyWords = { "ord", "eld", "gas", "kn�", "lax", "paj", "r�v", "�ng", "pil", "�ga", "bil" };
	static String[] mediumWords = { "yrke", "salong", "dator", "grupp", "mobil", "penna", "klimat", "l�ga", "arkiv",
			"straff" };
	static String[] hardWords = { "drottning", "identitet", "regiss�r", "f�ngelse", "verktyg", "arom�mne", "hj�rtslag",
			"f�rgiftning", "precision", "bl�ckfisk" };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Hej v�lkommen till h�nga gubbe!");
		while (true) { 
			System.out.println("V�lja en av de sv�rhetsgraderna som finns");
			System.out.println("(1) L�tt - 3 bokst�ver i ordet");
			System.out.println("(2) Medium - Max 6 bokst�ver i ordet");
			System.out.println("(3) Sv�r - Ingen gr�ns p� bokst�ver");
			System.out.println("(4) Hur man spelar");
			System.out.println("(5) Avsluta spel");
			
			int difficulty = inputInt(); // tar in val av case
			boolean played = true;
			switch (difficulty) {

			case 1:
				System.out.println("Gissa p� en bokstav");
				hiddenWord(easyWords[randomIndex()]); 

				break;

			case 2:
				System.out.println("Gissa p� en bokstav");
				hiddenWord(mediumWords[randomIndex()]);
				break;
			case 3:
				System.out.println("Gissa p� en bokstav eller ord");
				hiddenWord(hardWords[randomIndex()]);
				break;
			case 4:
				played = true;
				System.out.println("Spelet g�r ut p� att gissa ett ord genom att gissa vilka bokst�ver ordet inneh�ller.");
				System.out.println("Om man gissar en bokstav r�tt s� visas den i ordet p� den positionen den har.");
				System.out.println("Men om man gissar fel l�ggs det till ett str�ck till den h�ngda gubben tills gubben �r f�rdig.");
				break;
			case 5:
				played = false;
				System.out.println("Hejd�!");
				System.exit(0);
			default:
				System.out.println("Skriv en av siffrorna inom ()");
				played = false;
				break;
			}
			if (played) { // Kollar ifall spelet har spelats eller inte och ger en ett val att spela igen
				System.out.println("Om du vill spela skriv ja");
				System.out.println("Om inte skriv nej");
				String answer = inputString();
				if (!answer.contentEquals("ja")) {
					System.out.println("Hejd�!");
					break;

				}
			}
		}
	}

	/**
	 * genererar ett random tal fr�n 0 till 9
	 * @return
	 */
	private static int randomIndex() {
		int max = 9;
		int min = 0;
		int wordIndex = (int) ((Math.random() * (max - min)) + min);
		return wordIndex;
	}

	/**
	 * Tar in ett ord och kollar ifall det matchar inputen fr�n anv�ndarn
	 * @param word
	 */
	private static void hiddenWord(String word) {
		String guesses = "";
		int guessAmount = 7;
		while (guessAmount > 0) { // k�r tills antalet gissningar tar slut
			String guess = inputString();
			if (word.contains(guess)) { // kollar ifall gissningen matchar ordet
				guesses += guess;
				playmusic("Hangman/correct.wav");
			}
			else if (word.contains(guess) == false) { // om ordet inte matchar s�nks antalet gissningar kvar.
				guessAmount--;
				hangman(guessAmount);
			}
			String hidden = "";
			int wordLength = word.length();
			boolean rightAnswer = true;
			for (int i = 0; i < wordLength; i++) {

				if (guesses.contains(word.substring(i, i + 1))) { // ers�tter "_ " med anv�ndarens input ifall den matchar ordet som s�kes
					hidden += word.substring(i, i + 1) + " ";

				} else { // ers�tter ordets bokst�ver med "_ "
					rightAnswer = false;
					hidden += "_ ";
				}

			}
			System.out.println(hidden);
			if (rightAnswer) {
				playmusic("Hangman/TaDa.wav");
				System.out.println("Grattis du gissa r�tt ord!");
				return;
			}
			if (guessAmount == 0){
				System.out.println("Du har slut p� gissningar");
				System.out.println("Ordet var " + word);

			}
			
		}
	}

	private static void hangman(int guessAmount) {

		if (guessAmount == 6){
			System.out.print(
					"  +---+\n" +
					"  |   |\n" +
					"      |\n" +
					"      |\n" +
					"      |\n" +
					"      |\n" +
					"=========\n"
			);
		}

		else if (guessAmount == 5){
			System.out.print(
					"  +---+\n" +
					"  |   |\n" +
					"  O   |\n" +
					"      |\n" +
					"      |\n" +
					"      |\n" +
					"=========\n"
			);
		}

		else if (guessAmount == 4){
			System.out.print(
					"  +---+\n" +
					"  |   |\n" +
					"  O   |\n" +
					"  |   |\n" +
					"      |\n" +
					"      |\n" +
					"=========\n"
			);
		}

		else if (guessAmount == 3){
			System.out.print(
					"  +---+\n" +
					"  |   |\n" +
					"  O   |\n" +
					" /|   |\n" +
					"      |\n" +
					"      |\n" +
					"========\n"
			);
		}

		else if (guessAmount == 2){
			System.out.print(
					"  +---+\n" +
					"  |   |\n" +
					"  O   |\n" +
					" /|\\  |\n" +
					"      |\n" +
					"      |\n" +
					"=========\n"
			);
		}

		else if (guessAmount == 1){
			System.out.print(
					"  +---+\n" +
					"  |   |\n" +
					"  O   |\n" +
					" /|\\  |\n" +
					" /    |\n" +
					"      |\n" +
					"=========\n"
			);
		}

		else if (guessAmount == 0){
			System.out.print(
					"  +---+\n" +
					"  |   |\n" +
					"  O   |\n" +
					" /|\\  |\n" +
					" / \\  |\n" +
					"      |\n" +
					"=========\n");
		}
	}

	/**
	 * Tar in en ljudfil och spelar upp n�r den blir kallad.
 	 * @param Filepath
	 */
	private static void playmusic(String Filepath) {
		InputStream music;
		try {
			music = new FileInputStream(new File(Filepath));
			AudioStream audios = new AudioStream(music);
			AudioPlayer.player.start(audios);
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	/**
	 * Tar in en interger och kollar ifall det �r en interger eller inte.
	 * @return
	 */
	private static int inputInt() {
		int crashtest = 0;
		while (true) {
			try {
				crashtest = input.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Skriv en Siffra");
				input.nextLine();
			}
		}
		return crashtest;
	}

	/**
	 * Tar in en String och kollar ifall det �r en String eller inte,
	 * @return
	 */
	private static String inputString() {
		String crashtest = "";
		while (true) {
			try {
				crashtest = input.next();
				break;
			} catch (Exception e) {
				System.out.println("Skriv en bokstav eller ord");
				input.nextLine();
			}
		}
		return crashtest;
	}
}
