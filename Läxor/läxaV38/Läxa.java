package l�xaV38;

import java.util.Scanner;

public class L�xa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int nmr1 = 0, nmr2 = 0, nmr3 = 0, nmr4 = 0, nmr5 = 0; 
		int sum;
		
		
		System.out.println("Skriv in 5 heltal:");
		nmr1 = input.nextInt();
		nmr2 = input.nextInt();
		nmr3 = input.nextInt();
		nmr4 = input.nextInt();
		nmr5 = input.nextInt();
		
		if (nmr1 > nmr2 && nmr1 > nmr3 && nmr1 > nmr4 && nmr1 > nmr5)
			System.out.println("H�gst:	" + nmr1);
		
		else if (nmr2 > nmr1 && nmr2 > nmr3 && nmr2 > nmr4 && nmr2 > nmr5)
			System.out.println("H�gst:	" + nmr2);
		
		else if (nmr3 > nmr1 && nmr3 > nmr2 && nmr3 > nmr4 && nmr3 > nmr5)
			System.out.println("H�gst:	" + nmr3);
		
		else if (nmr4 > nmr1 &&  nmr4 > nmr2 &&  nmr4 > nmr3 && nmr4 > nmr5)
			System.out.println("H�gst:	" + nmr4);
		
		else if (nmr5 > nmr1 && nmr5 > nmr2 && nmr5 > nmr3 && nmr5 > nmr4)
			System.out.println("H�gst:	" + nmr5);
		
		else
			System.out.println("H�gst:	Alla tal lika stora");
		
		
		if (nmr1 < nmr2 && nmr1 < nmr3 && nmr1 < nmr4 && nmr1 < nmr5)
			System.out.println("L�gst:	" + nmr1);
		
		else if (nmr2 < nmr1 && nmr2 < nmr3 && nmr2 < nmr4 && nmr2 < nmr5)
			System.out.println("L�gst:	" + nmr2);
		
		else if (nmr3 < nmr1 && nmr3 < nmr2 && nmr3 < nmr4 && nmr3 < nmr5)
			System.out.println("L�gst:	" + nmr3);
		
		else if (nmr4 < nmr1 &&  nmr4 < nmr2 &&  nmr4 < nmr3 && nmr4 < nmr5)
			System.out.println("L�gst:	" + nmr4);
		
		else if (nmr5 < nmr1 && nmr5 < nmr2 && nmr5 < nmr3 && nmr5 < nmr4)
			System.out.println("L�gst:	" + nmr5);
		
		else
			System.out.println("L�gst:	Alla tal lika stora");
			
		sum = (nmr1 + nmr2 + nmr3 + nmr4 + nmr5);
	
		System.out.println("Medelv�rde: " + (sum / 5) );
	}

}
