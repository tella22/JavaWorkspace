import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		int num;
		int k;
		int cont=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		while (num < 1){
			System.out.println("El numero introducido es negativo");
			num=teclado.nextInt();					
		}
		
		for (k=1; k<=num; k=k+1){
			if (num % k == 0){
				cont=cont+1;
			}
		}
		
		if (cont==2){
			System.out.println("El numero introducido es primo");
		}else{
			num=num+1;
			for (k=2; k<num-1; k=k+1){
				if (num % k == 0){
					cont=cont+1;
				}
			}
			System.out.println(num + " es el numero primo más cercano");
		}
		
		

	}//main

}//class