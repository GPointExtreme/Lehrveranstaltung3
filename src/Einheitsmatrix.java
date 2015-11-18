
public class Einheitsmatrix {

	public static void main(String[] args) {
		// Quadratische Matrix diagonale generieren
		
		generatematrix(5);

	}
				
	public static double [][] generatematrix(int size) {
		double [][] matrix = new double [size][size];
		
		for (int i=0; i < size; i++) {
			
			for (int j=0; j < size; j++) {
				if(i==j) {
					matrix [i][j]=1.0;
				}
			System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		return matrix;
	}
		
}
