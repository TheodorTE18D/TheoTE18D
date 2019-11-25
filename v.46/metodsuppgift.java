import java.util.Scanner;
public class metodsuppgift {
	
	public static void main(String[] args) {
		
		  System.out.println(fahrenheitToKelvin(100));
		  System.out.println(kelvinToCelsius(0));
		  System.out.println(velocityConversion(90));
		  System.out.println(kineticEnergy(2,2));
		  System.out.println(potentialEnergy(2,5)); System.out.println(delta(-1,6,10));
		  System.out.println(smallLetters("PaParaZZi"));
		  System.out.println(pr0grammering("Jag vill få a i programmering! <3"));
		  System.out.println(svtTime(10,2)); System.out.println(work(50,10));
		  System.out.println(velocityToHeight(9.82));
		  System.out.println(sphereVolumeToRadius(20));
		  bestTeam();
		  nameBackward();
	}
	/**
	 * Tar in fahrenheit och omvandlar det till kelvin.
	 * @param fahrenheit
	 * @return kelvin
	 */
	public static double fahrenheitToKelvin(double fahrenheit) {
		
		return (fahrenheit + 459.67)* 5/9;
	}
	/**
	 * Tar in kelvin och omvandlar det till celsius.
	 * @param kelvin
	 * @return celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
	
		return kelvin - 273.15;
	}
	/**
	 * Tar in km/h och omvandlar det till m/s.
	 * @param velocityKmH
	 * @return velocity m/s 
	 */
	public static double velocityConversion(double velocityKmH) {
		
		return velocityKmH / 3.6;
	}
	/**
	 * Tar in massa och hastighet och räknar ut kinetisk energi.
	 * @param mass
	 * @param velocity
	 * @return kinetsik energi
	 */
	public static double kineticEnergy(double mass, double velocity) {
		
		return (mass * Math.pow(velocity, 2) )/ 2;
	}
	/**
	 * Tar in massa och höjd och räknar ut potentiell energi.
	 * @param mass
	 * @param height
	 * @return Potentiell energi
	 */
	public static double potentialEnergy(double mass, double height) {
		
		return mass * 9.82 * height;
	}
	/**
	 * Tar in 3 olika variablar och räknar ut medelvärdet.
	 * @param first
	 * @param second
	 * @param last
	 * @return medelvärdet
	 */
	public static double delta(double first, double second, double last) {
		
		return (first + second + last)/3;
	}
	/**
	 * Tar in meningen word och omvandlar den till små bokstäver.
	 * @param word
	 * @return word
	 */
	public static String smallLetters(String word) {
		
		return word.toLowerCase();
		
	}
	/**
	 * Tar in meningen word och omvandlar den till stora bokstäver och ändra "o" till 0.
	 * @param word
	 * @return word
	 */
	public static String pr0grammering(String word) {
		
		return word.toUpperCase().replace("O", "0");
	}
	/**
	 * Tar in stäckan och hastigheten och räknar ut tiden. 
	 * @param distance
	 * @param velocity
	 * @return time
	 */
	public static double svtTime(double distance, double velocity) {
		
		return distance/velocity;
	}
	/**
	 * Tar in kraft och sträcka och räknar ut arbetet.
	 * @param force
	 * @param distance
	 * @return work
	 */
	public static double work(double force, double distance) {
		
		return force * distance;
	}
	/**
	 * Tar in Hastigheten på ett föremål som färdas uppåt och räknar ut hur högt föremålet kommer.
	 * @param velocity
	 * @return height
	 */
	public static double velocityToHeight(double velocity) {
		
		return Math.pow(velocity, 2)/(2* 9.82);
				
	}
	/**
	 * Tar in sfärens volym och räknar ut sfärens radie.
	 * @param Volume
	 * @return Radius
	 */
	public static double sphereVolumeToRadius(double Volume) {

		
		double radiusCubic = Volume / ((4 * Math.PI)/ 3); 
		return Math.cbrt(radiusCubic);
	}
	/**
	 * Frågar efter bästa laget i England och ersätter laget man skrivit in med Arsenal.
	 */
	public static void bestTeam() {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vilket är det bästa fotbollslaget i England?");
		String team = input.nextLine();
		System.out.print(team.replace(team, "Arsenal"));
		
		
	} 
	 /**
	  * Läser in en sträng från tangetbordet och skriver ut den baklänges.  
	  */
	public static void nameBackward() {
		
		
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		StringBuilder sb = new StringBuilder(name);
		System.out.println(sb.reverse());
	}

}
