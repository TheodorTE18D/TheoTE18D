/**
 * 
 */
import java.util.Scanner; 

/**
 * @author theodor.niklasson
 *
 */
public class Heml�xaV37 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Vad heter du?");
		String user = input.nextLine();
		System.out.print("Hur gammal �r du?");
		String userAge = input.nextLine();
		System.out.print("Vad �r din adress?");
		String userAddress = input.nextLine();
		System.out.print("Vad �r ditt postnummer?");
		String userZipCode = input.nextLine();
		System.out.print("Vilken stad bor du i?");
		String userCity = input.nextLine();
		System.out.print("Vad �r ditt telefonnummer?");
		String userPhone = input.nextLine();
		System.out.println("Information:");
		System.out.println("Namn:\t\t" + user);
		System.out.println("�lder:\t\t" + userAge + " �r");
		System.out.println("Adress:\t\t" + userAddress);
		System.out.println("\t\t" + userZipCode + " " + userCity);
		System.out.println("Telefon:\t" + userPhone);
    }
}
