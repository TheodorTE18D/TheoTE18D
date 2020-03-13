package modulus;

public class v40lektion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tal1 = 77;
		int tal2 = 19;
		int tal3 = 35;
		int tal4 = 47;
		
		System.out.println(tal1 % 3);

		int sum = 0;
		
		for (int i = 0 ; i < 101 ; i++) {
			
			if (i % 3 == 0) {
				System.out.println("Talet " + i + " är det delbart med 3" );
				
				sum += i;
			}
		}
			System.out.println("The total of all integers divideable by 3 is: "  + sum);
	}

}
