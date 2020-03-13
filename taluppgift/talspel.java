import java.util.Scanner;
import java.io.*;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class talspel {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello and welcome!");
		while (true) { // k�r om programmet tills man inte vill k�ra l�ngre.
			System.out.println("Which difficulty do you want?");
			System.out.println("(1) Easy 10 tries");
			System.out.println("(2) Medium 7 tries");
			System.out.println("(3) Hard 3 tries");
			System.out.println("(4) Exit game");

			int difficulty = input();

			boolean played = true; // Kollar ifall spelet har k�rts �n.
			switch (difficulty) { // V�ljer vilket kod som ska k�ras beroende p� vilken sv�righetsgrad man har valt.

			case 1:
				Guess(10);
				break;
			case 2:
				Guess(7);
				break;
			case 3:
				Guess(3);
				break;
			case 4:
				played = false;
				System.out.println("Good bye!");
				System.exit(0);
			default:
				System.out.println("Choose one of the difficulties");
				played = false;
				break;
			}
			if (played) { 
				System.out.println("If you want to play again type yes");
				System.out.println("if not just type something else.");
				String answer = input.next();
				if (!answer.contentEquals("yes")) {
					System.out.println("Good bye!");
					break;

				}
			}
		}
	}

	private static void Guess(int guesses) {
		System.out.println("Choose two numbers to guess between");
		int nmr1 = input();
		int nmr2 = input();

		if (nmr1 > nmr2) {// V�nder p� intergerna som skrivs in s� att det minsta talet alltid skrivs in f�rst.
			int tmp = nmr1;
			nmr1 = nmr2;
			nmr2 = tmp;
		}

		int i;
		System.out.println("Guess a number between " + nmr1 + " and " + nmr2);

		int result = (int) ((Math.random() * (nmr2 - nmr1)) + nmr1); // Genererar ett random interger mellan de tv� intergerna man skriver in.

		for (i = 0; i < guesses; i++) { // Loopar denna kod tills en guesses tar slut
			int guess = input();
			if (result == guess) {
				playmusic("C://TaDa.wav");
				System.out.println("Yay! you guessed right");
				break;
			} else {
				if (guess == 666) { 
					playmusic("C://Evil.wav");

				} else {
					if (guess < result) { // ger en hint om result �r h�gre eller l�gre �n guess
						System.out.println("Too low!");
					} else if (guess > result) {
						System.out.println("Too high!");
					}
				}
			}

			if (guess < nmr1 || guess > nmr2) { // kollar ifall guess �r imelllan de tv� talen man har skrivit
				System.out.println("Guess between " + nmr1 + " and " + nmr2);
			}

		}
		if (i == guesses) // k�rs n�r man f�r slut p� gissningar

		{
			System.out.println("GAME OVER!");
			System.out.println("The correct answer was: " + result);
			playmusic("C://sound.wav");
		}

	}

	private static void playmusic(String Filepath) { // Tar in en ljudfil och spelar upp den filen n�r den blir kallad
		InputStream music;
		try {
			music = new FileInputStream(new File(Filepath));
			AudioStream audios = new AudioStream(music);
			AudioPlayer.player.start(audios);
		} catch (Exception e) {
			System.out.println("error");
		}
	}

	private static int input() { // Kollar ifall inputet �r en interger om inte skriver den ut "write a number" ist�llet f�r att programmet crashar
		int crashtest = 0;
		while (true) {
			try {
				crashtest = input.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Write a number");
				input.nextLine();
			}
		}
		return crashtest;
	}
}
