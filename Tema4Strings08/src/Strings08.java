import java.util.Scanner;

public class Strings08 {

	public static void main(String[] args) {
		
		String frase;
		final int max_length=80;
		String may="ABCDEFGHJIKLMN�OPQRSTUVWXYZ ";
		boolean mayus;
		int num;
		String cifrado="";
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.println("Introduce una frase en may�sculas");
			frase=teclado.nextLine();
			mayus = true;
			for (int cont=0; cont<frase.length() && mayus == true; cont++){
				char caracter = frase.charAt(cont);
				if(may.indexOf(caracter) != -1){
				}else{
					System.out.println("El caracter en posici�n "+ cont + " no es may�scula");
					mayus = false;
				}
			}
		}while (mayus==false);
		
		do {
			System.out.println("Ahora introduce un numero entre 1 y 10 para el cifrado");
			num=teclado.nextInt();
		}while(num < 1 || num > 10);
		
		for (int cont=0; cont<frase.length(); cont++){
			char caracter2 = frase.charAt(cont);
			caracter2=(char) (caracter2+num);		
			cifrado=cifrado+caracter2;
		}
		System.out.println(cifrado);
	}

}
