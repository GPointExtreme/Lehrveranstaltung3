
public class BreakContinueDemo {

	public static void main(String[] args) {

		//1 bis 100 zählen und die Zahlen auslassen die durch 5 teilbar sind
		//Von 40 bis 70 auch auslassen
		
		
		for(int h=1; h <= 100; h++) {
			if (h >= 40 && h <= 70 || (h%5==0)) {
					continue;
			}
		
			System.out.println("Durchlauf " + h);
		
		}

	}

}
