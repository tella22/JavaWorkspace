import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int num;
		int k;
		int cont=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		for (k=2; k<num; k=k+1){
			if (num % k == 0){
				cont=cont+1;
			}
		}
		
		if (cont>0){
			System.out.println("El numero no es primo");
		}else {
			System.out.println("El numero es primo");
		}
		
	}

}
