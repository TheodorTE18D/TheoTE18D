import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Spavanac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int m = input.nextInt();
		
		// Skapar en LocalTime för de inmatande värderna 
		LocalTime inputTime = LocalTime.of(h, m);
		
		// Drar bort 45 minuter från inputTime 
		LocalTime outputTime = inputTime.minusMinutes(45);
		
		// Skapar en format för utskriften
		DateTimeFormatter myformatter = DateTimeFormatter.ofPattern("H m");
		
		// Skriver ut outputTime med rätt format
		System.out.println(outputTime.format(myformatter));
		
	}
	

}
