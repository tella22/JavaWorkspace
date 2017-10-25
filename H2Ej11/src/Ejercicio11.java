import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int num;
		int num2;
		int k;
		int sumapar=0;
		int sumaimpar=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		System.out.println("Escribe otro numero: ");
		num2=teclado.nextInt();
		
		while(num<=num2){
			System.out.println("El primer valor es mayor que el segundo ");
			System.out.println("Escribe un numero otra vez: ");
			num=teclado.nextInt();	
			System.out.println("Escribe otro numero otra vez: ");
			num2=teclado.nextInt();	
		}	
			
		for(k=num; num2<=k; k=k-1){
			if (k % 2 == 0){
				sumapar=sumapar+k;
			}else {
				sumaimpar=sumaimpar+k;
			}
		}
		
		System.out.println("La suma de numeros pares es: " + sumapar);
		System.out.println("La suma de numeros impares: " + sumaimpar);
		
	}//main

}//class
