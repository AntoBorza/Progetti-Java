import java.io.*;
public class RicercaSequenziale2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		char vettore[];
		int ncaratteri, i = 0;
		char paperino;
		
		System.out.print("Di quanti caratteri è formato il vettore? ");
		ncaratteri = Integer.parseInt(stdin.readLine());
		
		vettore = new char [ncaratteri];
		
		for (i = 0; i < ncaratteri; i++)
			vettore[i] = stdin.readLine().charAt(0);
			
		System.out.print("Inserisci il carattere da cercare: ");
		paperino = stdin.readLine().charAt(0);
		
		for (i = 0; i < ncaratteri; i++) {
			if (vettore[i] == paperino) {
				System.out.print("I = " +i);
			}
	}
	}
}


