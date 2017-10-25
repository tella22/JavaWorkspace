import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num;
		int suma=0;
		int cont=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		while (num != 0){
			suma=suma+num;
			if (num % 5 == 0){
				cont=cont+1;
			}
			
			System.out.println("Escribe un numero: ");
			num=teclado.nextInt();
		}
		
		System.out.println("El total es: " + suma);
		System.out.println("Has introducido  " + cont + " numeros multiplos de 5");
	}

}
