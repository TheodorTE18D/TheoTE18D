package v38;

import java.util.Scanner;

public class L�xa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		int FirstNumber = 0, SecondNumber = 0, ThirdNumber = 0, FourthNumber = 0, FifthNumber = 0; 
		int sum;
		
		
		System.out.println("Skriv in 5 heltal:");
		FirstNumber = input.nextInt();
		SecondNumber = input.nextInt();
		ThirdNumber = input.nextInt();
		FourthNumber = input.nextInt();
		FifthNumber = input.nextInt();
		
		
		sum = (FirstNumber + SecondNumber + ThirdNumber + FourthNumber + FifthNumber);
	 
		
		System.out.println("H�gst:" );
		System.out.println("L�gst:");
		System.out.println("Medelv�rde:" + (sum / 5) );
	}

}
