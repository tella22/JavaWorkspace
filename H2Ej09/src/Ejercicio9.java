import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {

		int num;
		int cont=0;
		int suma=0;
		int max;
		int min;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		max=num;
		min=num;
		
		while (num != 0){
			
			suma=suma+num;
			
			cont=cont+1;
			
			if (num > max){
				max=num;
			}else if (num < min){
				min=num;
			}
			
			System.out.println("Escribe un numero: ");
			num=teclado.nextInt();
		}
		
			System.out.println("El minimo introducido es " + min);
			System.out.println("El maximo introducido es " + max);
			System.out.println("La media es: " + suma/cont);
	}//main

}//class