import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int num;
		int k;
		int suma=0;
		int resultado;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		num=teclado.nextInt();
		
		while (num<1 && num>100){
			System.out.println("Valor no valido, ingresalo otra vez: ");
			num=teclado.nextInt();
		}
		
		for (k=1; k<=10; k=k+1){
			resultado=num*k;
			System.out.println(num + " * " + k + " = " + resultado);
		}

	}

}
