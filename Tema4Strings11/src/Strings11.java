import java.util.Scanner;

public class Strings11 {

	public static void main(String[] args) {
		
		String palabra;
		final int MAX_LENGTH=20;
		int k;
		int i;
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La frase debe tener como maximo " + MAX_LENGTH + " caracteres");
			palabra=teclado.nextLine();
		}while (palabra.length()>MAX_LENGTH);

		char letras[] = new char[palabra.length()];
		letras=palabra.toCharArray();
		for (k=0; k<palabra.length(); k++){
			for (i=0; i<palabra.length(); i++){
				System.out.print(letras[(palabra.length()*2-k+i)%palabra.length()]);
			}
			System.out.println();
		}
	teclado.close();
	}

}
