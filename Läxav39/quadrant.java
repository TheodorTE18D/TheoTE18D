import java.util.Scanner;


public class quadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Deklarerar variablerna
		int x = 0;
		int y = 0;
		int kvadrant = 0;
		
		// Läsa in x
		
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		
		// Läsa in y
		
		y = input.nextInt();
		
		// Kolla vilken kvadrant som är rätt
	    if (x > 0 & y > 0) {
	    	kvadrant = 1;
	    }
	    else if (x < 0 & y > 0) {
	    	kvadrant = 2;
	    }
	    else if (x < 0 & y < 0) {
	    	kvadrant = 3;
	    }
	    else {
	    	kvadrant = 4;
	    }
	    
		// Skriv ut kvadranten
	    System.out.println(kvadrant);
	}

}
