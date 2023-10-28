import java.io.*;
import java.util.*;
import java.io.File;
public class TraslaMatrice {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("Matrice.txt"));
		
		int matrice[][], i = 0, j = 0, scambio = 0, righe, colonne;
		
		matrice = new int [3][4];
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				matrice[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("La matrice iniziale è:");
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(matrice[i][j] + "   ");
			}
			System.out.println();
		}
		
		righe = i;
		colonne = j;
		
		System.out.println("Numero righe: " + righe + " // " + "Numero colonne: " + colonne);
		
		for (int h = 0; h < 37; h++) 
			System.out.print("-");
		
		System.out.println();
		
		System.out.println("La matrice traslata è:");
		
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(matrice[j][i] + "   ");
			}
			System.out.println();
		}
		
		righe = i;
		colonne = j;
		
		System.out.println("Numero righe: " + righe + " // " + "Numero colonne: " + colonne);
		
	}

}
