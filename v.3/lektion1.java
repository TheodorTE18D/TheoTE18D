import java.util.Arrays;
import java.util.Scanner;

public class lektion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("?");
		int nmr1 = input.nextInt();
		int nmr2 = input.nextInt();
		int sum = nmr2 + nmr1;
		int[] numbers = new int[sum];
		boolean swapped = false;
		int temp;
		System.out.println("");
		int amount = input.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*amount);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {
			
			swapped = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) { // Byter plats på två intillliggande tal
					temp = numbers[i]; // sparar tillfälligt värdet på vänstra sidan.
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					swapped = true;
					//System.out.println(Arrays.toString(numbers));
				}
			}
		} while (swapped);
		
		System.out.println(Arrays.toString(numbers));
	}
    
}
