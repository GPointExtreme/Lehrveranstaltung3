
public class BreakDemo {

	public static void main(String[] args) {

		//1 bis 100 zählen und die Zahlen ausgeben die durch 3 teilbar sind
		//Abbruch wenn 10 Zahlen gefunden wurden
		
		int i=1;
		
		for(int h=1; h <= 100; h++) {
			if (h%3==0) {
				System.out.println(i + " Durchlauf " + h);
				i++;
			}
			
			if (i==11) {
				break;
			}
		
		}

	}

}
	
