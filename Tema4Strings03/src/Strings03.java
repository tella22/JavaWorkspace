import java.util.Scanner;
public class Strings03 {

	public static void main(String[] args) {

		String frase;
		String palabra;
		int pos=0;
		int cont=0;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un frase");
		frase=teclado.nextLine();
		System.out.println("Introduce un palabra de la frase");
		palabra=teclado.nextLine();

		if (frase.indexOf(palabra) > -1){ /*Buscamos la palabra indicada por la frase*/
			pos = frase.indexOf(palabra); 
			System.out.println(cont+") La posicion de la palabra " +palabra+ " es " +pos);
			while (pos > -1){ /*Mientras no encuentre la palabra*/
				pos = pos+1;
				pos = frase.indexOf(palabra,pos);
				if(pos>-1){ /*Cuando no la encuentra finaliza el bucle*/
					cont = cont + 1;
					System.out.println(cont+") La posicion de la palabra " +palabra+ " es " +pos);
				}
			}
			
		}else{
			System.out.println("La palabra no esta en la frase.");
		}

	}

}
