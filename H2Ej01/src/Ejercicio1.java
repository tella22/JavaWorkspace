import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int suma=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor: ");
		a=teclado.nextInt();
		System.out.println("Ingrese el segundo valor: ");
		b=teclado.nextInt();

		
		while (a >= b){
			System.out.println("El primer numero debe ser menor al segundo introducido, introducelos otra vez");
			System.out.println("Ingrese el primer valor: ");
			a=teclado.nextInt();
			System.out.println("Ingrese el segundo valor: ");
			b=teclado.nextInt();
		}
		
		if (a % 2 == 0){
			for (int k= a+1; k <= b; k = k+2){
				suma= suma+k;
			}
		}else {
			for (int k= a; k <= b; k = k+2){
				suma= suma+k;}
		}
		
		System.out.println("El resultado es: ");
		System.out.println(suma);
		
	}

}
