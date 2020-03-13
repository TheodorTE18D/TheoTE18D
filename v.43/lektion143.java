import java.util.Scanner;

public class lektion143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Vänligen skriv in två heltal");

		int tal1 = input.nextInt();
		int tal2 = input.nextInt();

		System.out.println(minstaTal(tal1, tal2));
	}
 /**
  * jämför två heltal och utvärderar vilket som är minst. Samt skickar tillbaka en hälsning.
  * @param tal1
  * @param tal2
  * @return
  */
	static String minstaTal(int tal1, int tal2) {

		if (tal1 <= tal2) {
			System.out.println("minsta talet är: " + tal1);
		} else {
			System.out.println("minsta talet är: " + tal2);
		}

		String hej = "Metoden är klar";
		
		return hej;
	}
}
