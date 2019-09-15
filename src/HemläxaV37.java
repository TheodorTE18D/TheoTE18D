/**
 * 
 */
import java.util.Scanner; 

/**
 * @author theodor.niklasson
 *
 */
public class HemläxaV37 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Vad heter du?");
		String user = input.nextLine();
		System.out.print("Hur gammal är du?");
		String userAge = input.nextLine();
		System.out.print("Vad är din adress?");
		String userAddress = input.nextLine();
		System.out.print("Vad är ditt postnummer?");
		String userZipCode = input.nextLine();
		System.out.print("Vilken stad bor du i?");
		String userCity = input.nextLine();
		System.out.print("Vad är ditt telefonnummer?");
		String userPhone = input.nextLine();
    }
    
}
