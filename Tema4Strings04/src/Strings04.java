import java.util.Scanner;

public class Strings04 {

	public static void main(String[] args) {
		
		String frase;
		int num;
		final int max_length=80;
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La palabra debe tener como maximo " + max_length + " caracteres");
			frase=teclado.nextLine();
		}while (frase.length()>max_length);
		
		System.out.println("Elige una de las 2 opciones");
		System.out.println("1: la frase introducida aparecera en minusculas");
		System.out.println("2: la frase introducida aparecera en mayusculas");
		num=teclado.nextInt();
		
		while (num<1 || num>2){
			System.out.println("Debes introducir 1 o 2");
			System.out.println("1: la frase introducida aparecera en minusculas");
			System.out.println("2: la frase introducida aparecera en mayusculas");
			num=teclado.nextInt();
		}
		
		if (num == 1){
			System.out.println(frase.toLowerCase());
		}else{
			System.out.println(frase.toUpperCase());
		}
		teclado.close();
	}

}
