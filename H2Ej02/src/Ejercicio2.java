import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int num;
		int suma=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		num=teclado.nextInt();
		
		for (int k=2; k <=num; k=k+2){
			 suma= suma+k*k;
		}
		System.out.println("La suma es: " + suma);
	}

}
