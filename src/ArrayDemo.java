
public class ArrayDemo {

	public static void main(String[] args) {
		//Array Variante 1
		int [] number1 = new int [3];
		number1[0] = 3;
		number1[1] = 4;
		number1[2] = 5;
		
		//Array Variante 2
		int [] number2 = {7, 1, 3};
		
		//Array 1 mit 2 addieren!
		System.out.println((number1[0] + number2[0]) + ", " + (number1[1] + number2[1]) + ", " + (number1[2] + number2[2]) + "!");
		//Array 1 mit 2 multiplizieren
		System.out.println((number1[0] * number2[0]) + ", " + (number1[1] * number2[1]) + ", " + (number1[2] * number2[2]) + "!");
		
		//Array für Wochentage
		String[] tage = {"Mo", "Di", "Mi", "Do", "Fr", "Sa", "So"};
		
		for(int t=0; t < tage.length; t++) {
			System.out.println(tage[t]);
		}
		
	}

}
