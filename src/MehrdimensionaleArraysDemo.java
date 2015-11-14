
public class MehrdimensionaleArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] a = new int [2][3];
				
			a[0][0] = 1;
			a[0][1] = 2;
			a[0][2] = 3;
			a[1][1] = 4;
			a[1][1] = 5;
			a[1][2] = 6;
			
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i][0] + ", " + a[i][2]);
		}
			

	}

}
