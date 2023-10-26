import java.io.*;
import java.util.Scanner;
import java.io.File;
public class CalcoloTracciaMatrice {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(new File("MatriceQuadrata"));
		
		int matrice [][], i = 0, j = 0, traccia = 0;
		matrice = new int [3][3];
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matrice [i][j] = sc.nextInt();
			}
		}
		
		for (i = 0, j = 0; i < 3 && j < 3; i++, j++) 
			traccia += matrice[i][j];
		
	System.out.print("La traccia della matrice è: " + traccia);

	}

}
