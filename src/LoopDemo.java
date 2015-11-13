
public class LoopDemo {

	public static void main(String[] args) {
		
		//for Schleife ausprobieren
		for(int i=1; i <= 10; i++) {
			System.out.println("Durchlauf: " + i);
		}
		
		//while Schleife ausprobieren
		int j=1;
		while(j <= 10) {
			System.out.println("Durchlauf " + j);
			j++;
		}
		
		//Von 10 runter zählen
		for(int k=10; k >= 0; k--) {
			System.out.println("Durchlauf " + k);
		}
		
		//nur jede 5te Zahl ausgeben
		for(int l=20; l <= 90; l+=5) {
			System.out.println("Durchlauf " + l);
		}
		
		//1 bis 100 zählen und die Zahlen ausgeben die durch 3 teilbar sind
		for(int h=1; h <= 100; h++) {
			if (h%3==0)
			System.out.println("Durchlauf " + h);
		}

	}

}
