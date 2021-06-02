package jbook;

public class TavolaPitagorica {

	public static void main(String[] args) {
		int righe = 10;
		int colonne = 10;
		int[][] tavola = new int[righe][colonne];
		// riempimento della tavola
		for (int i = 0; i < righe; i++) {
			for (int j = 0; j < colonne; j++) {
				tavola[i][j] = (i + 1) * (j + 1);
			}
		}
		// stampa della tavola
		for (int i = 0; i < righe; i++) {
			for (int j = 0; j < colonne; j++) {
				System.out.print("\t" + tavola[i][j]);
			}
			System.out.println();
		}
	}
}
