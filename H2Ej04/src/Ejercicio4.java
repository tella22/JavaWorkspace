import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num;
		int k;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		for (k=1; k<=num; k=k+1){
			if (num % k == 0){
				System.out.println(k + " es divisor de " + num);
			}
		}		
		
	}

}
