import java.util.Scanner;

public class Strings08 {

	public static void main(String[] args) {
		
		String frase;
		String may="ABCDEFGHJIKLMNÑOPQRSTUVWXYZ ";
		boolean mayus;
		int num;
		String cifrado="";
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.println("Introduce una frase en mayúsculas");
			frase=teclado.nextLine();
			mayus = true;
			for (int cont=0; cont<frase.length() && mayus == true; cont++){
				char caracter = frase.charAt(cont);
				if(may.indexOf(caracter) != -1){
				}else{
					System.out.println("El caracter en posición "+ cont + " no es mayúscula");
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
			if(caracter2>=65 && caracter2<=90) {
				caracter2=(char) (caracter2+num);		
				cifrado=cifrado+caracter2;
			}else {
				cifrado=cifrado+space;
			}
		}
		System.out.println(cifrado);
		teclado.close();
	}

}
