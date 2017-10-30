import java.util.Scanner;
public class Strings02 {

	public static void main(String[] args) {
		
		String palabra;
		int cont=0;
		final int max_length=80;
		int may=0;
		int min=0;
		int pos=0;
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La palabra debe tener como maximo " + max_length + " caracteres");
			palabra=teclado.nextLine();
		}while (palabra.length()>max_length);{
			for (cont=0; cont<palabra.length(); cont++){
				char caracter = palabra.charAt (pos);
				if (caracter>64 && caracter <91){
					may=may+1;
				}
				if(caracter>96 && caracter<123){
					min=min+1;
				}
				pos++;
			}
		}
		System.out.println("La frase introducida tiene " + may + " mayusculas");
		System.out.println("La frase introducida tiene " + min + " minusculas");
		
		teclado.close();
	}
}
