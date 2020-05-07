import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Hangman {

	static Scanner input = new Scanner(System.in);
	static String[] easyWords = { "ord", "eld", "gas", "knä", "lax", "paj", "räv", "äng", "pil", "öga", "bil" };
	static String[] mediumWords = { "yrke", "salong", "dator", "grupp", "mobil", "penna", "klimat", "låga", "arkiv",
			"straff" };
	static String[] hardWords = { "drottning", "identitet", "regissör", "fängelse", "verktyg", "aromämne", "hjärtslag",
			"förgiftning", "precision", "bläckfisk" };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Hej välkommen till hänga gubbe!");
		while (true) { 
			System.out.println("Välja en av de svårhetsgraderna som finns");
			System.out.println("(1) Lätt - 3 bokstäver i ordet");
			System.out.println("(2) Medium - Max 6 bokstäver i ordet");
			System.out.println("(3) Svår - Ingen gräns på bokstäver");
			System.out.println("(4) Hur man spelar");
			System.out.println("(5) Avsluta spel");
			
			int difficulty = inputInt(); // tar in val av case
			boolean played = true;
			switch (difficulty) {

			case 1:
				System.out.println("Gissa på en bokstav");
				hiddenWord(easyWords[randomIndex()]); 

				break;

			case 2:
				System.out.println("Gissa på en bokstav");
				hiddenWord(mediumWords[randomIndex()]);
				break;
			case 3:
				System.out.println("Gissa på en bokstav eller ord");
				hiddenWord(hardWords[randomIndex()]);
				break;
			case 4:
				played = true;
				System.out.println("Spelet går ut på att gissa ett ord genom att gissa vilka bokstäver ordet innehåller.");
				System.out.println("Om man gissar en bokstav rätt så visas den i ordet på den positionen den har.");
				System.out.println("Men om man gissar fel läggs det till ett sträck till den hängda gubben tills gubben är färdig.");
				break;
			case 5:
				played = false;
				System.out.println("Hejdå!");
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
					System.out.println("Hejdå!");
					break;

				}
			}
		}
	}

	/**
	 * genererar ett random tal från 0 till 9
	 * @return
	 */
	private static int randomIndex() {
		int max = 9;
		int min = 0;
		int wordIndex = (int) ((Math.random() * (max - min)) + min);
		return wordIndex;
	}

	/**
	 * Tar in ett ord och kollar ifall det matchar inputen från användarn
	 * @param word
	 */
	private static void hiddenWord(String word) {
		String guesses = "";
		int guessAmount = 7;
		while (guessAmount > 0) { // kör tills antalet gissningar tar slut
			String guess = inputString();
			if (word.contains(guess)) { // kollar ifall gissningen matchar ordet
				guesses += guess;
				playmusic("Hangman/correct.wav");
			}
			else if (word.contains(guess) == false) { // om ordet inte matchar sänks antalet gissningar kvar.
				guessAmount--;
				hangman(guessAmount);
			}
			String hidden = "";
			int wordLength = word.length();
			boolean rightAnswer = true;
			for (int i = 0; i < wordLength; i++) {

				if (guesses.contains(word.substring(i, i + 1))) { // ersätter "_ " med användarens input ifall den matchar ordet som sökes
					hidden += word.substring(i, i + 1) + " ";

				} else { // ersätter ordets bokstäver med "_ "
					rightAnswer = false;
					hidden += "_ ";
				}

			}
			System.out.println(hidden);
			if (rightAnswer) {
				playmusic("Hangman/TaDa.wav");
				System.out.println("Grattis du gissa rätt ord!");
				return;
			}
			if (guessAmount == 0){
				System.out.println("Du har slut på gissningar");
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
	 * Tar in en ljudfil och spelar upp nör den blir kallad.
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
	 * Tar in en interger och kollar ifall det är en interger eller inte.
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
	 * Tar in en String och kollar ifall det är en String eller inte,
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
