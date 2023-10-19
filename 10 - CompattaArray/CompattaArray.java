import java.io.*;
public class CompattaArray {

	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		int array[], numero, i = 0, lunghezzaarray;
		
		System.out.print("Quanti numeri vuoi che compongano l'array? ");
		lunghezzaarray = Integer.parseInt(stdin.readLine());
		
		array = new int [lunghezzaarray];
		
		System.out.println("Componi l'array: ");
		for (i = 0; i < lunghezzaarray; i++) 
			array[i] = Integer.parseInt(stdin.readLine());
		
		System.out.print("Quale numero vuoi che venga messo in coda? ");
		numero = Integer.parseInt(stdin.readLine());
		
		for (i = 0; i < lunghezzaarray - 1; i++) {
			if (array[i] == numero) {
				array[i] = numero;
				array[i+1] = numero;
			}
		}
		
		System.out.print("L'array finale è: ");
		for (i = 0; i < lunghezzaarray; i++) 
			System.out.print(array[i] + " ");
		
	}

}
