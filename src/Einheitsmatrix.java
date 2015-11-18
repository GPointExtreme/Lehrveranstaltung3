
public class Einheitsmatrix {

	public static void main(String[] args) {
		// Quadratische Matrix diagonale generieren
		
		printMatrix(generatematrix(5));

	}
	
	//Matrix wird hier gebaut mit lauter 0er
	public static void printMatrix(double[][] matrix) {
		for(int i=0; i < matrix.length; i++) {
			for(int n=0; n < matrix.length; n++) {
				System.out.print(matrix[i][n]+"\t");
			}
			System.out.println();
		}
	}
	
	//wenn Spalte und Zeile gleich sind soll ein 1er ausgegeben werden
	public static double [][] generatematrix(int size) {
		double [][] matrix = new double [size][size];
		
		for (int i=0; i < size; i++) {
			matrix [i][i]=1.0;
		}
		return matrix;
	}
		
}
