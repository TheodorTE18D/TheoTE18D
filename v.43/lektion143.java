import java.util.Scanner;

public class lektion143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("V�nligen skriv in tv� heltal");

		int tal1 = input.nextInt();
		int tal2 = input.nextInt();

		System.out.println(minstaTal(tal1, tal2));
	}
 /**
  * j�mf�r tv� heltal och utv�rderar vilket som �r minst. Samt skickar tillbaka en h�lsning.
  * @param tal1
  * @param tal2
  * @return
  */
	static String minstaTal(int tal1, int tal2) {

		if (tal1 <= tal2) {
			System.out.println("minsta talet �r: " + tal1);
		} else {
			System.out.println("minsta talet �r: " + tal2);
		}

		String hej = "Metoden �r klar";
		
		return hej;
	}
}
