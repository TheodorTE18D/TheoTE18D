import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Spavanac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int h = input.nextInt();
		int m = input.nextInt();
		
		// Skapar en LocalTime f�r de inmatande v�rderna 
		LocalTime inputTime = LocalTime.of(h, m);
		
		// Drar bort 45 minuter fr�n inputTime 
		LocalTime outputTime = inputTime.minusMinutes(45);
		
		// Skapar en format f�r utskriften
		DateTimeFormatter myformatter = DateTimeFormatter.ofPattern("H m");
		
		// Skriver ut outputTime med r�tt format
		System.out.println(outputTime.format(myformatter));
		
	}
	

}
