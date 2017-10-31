import java.util.Scanner;

public class Strings10 {

	public static void main(String[] args) {

		String frase;
		final int MAX_LENGTH=60;
		int letras[] = new int[26];
		int cont=0;

		//		String frase;
		//		final int max_length=60;
		//		final int letras=26;
		//		int contador[] = new int[letras];

		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La frase debe tener como maximo " + MAX_LENGTH + " caracteres");
			frase=teclado.nextLine();
		}while (frase.length()>MAX_LENGTH);
		
		for (int k=0; k<letras.length; k++){
			letras[k]=0;
		}

		String mayusculas = frase.toUpperCase();

		for (int i=0; i<frase.length(); i++){
			if (mayusculas.charAt(i)>=65 && mayusculas.charAt(i) <= 90){
				int caracter = mayusculas.charAt(i);
				int resta = caracter-65;
				letras[resta]++;
			}
		}
		for(int j=0; j<letras.length; j++){
			if(letras[j]>0){
			cont++;
			System.out.println("La letra " + (char)(j+65) +" "+ letras[j]);	
			}
		}

		System.out.println("Aparecen " + cont + " letras diferentes");	
		teclado.close();
	}
}