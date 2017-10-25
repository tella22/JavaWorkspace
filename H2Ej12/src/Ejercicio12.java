import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		int num;
		int k;
		int fact=1;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		while(num<=0){
			System.out.println("El numero es igual o menor a 0, introduce otro: ");
			num=teclado.nextInt();
		}
		
		for (k=num; k>0; k=k-1){
			fact=fact*k;
			
		}
		System.out.println("El factorial de " + num + " es " + fact);
	}

}
