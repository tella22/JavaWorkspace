import java.util.Scanner;

public class H3Ej15 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int cont=0;
		int contpar=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num1=teclado.nextInt();
		System.out.println("Introduce otro numero");
		num2=teclado.nextInt();
		while (num1>=num2){
			System.out.println("el primero debe ser menor al segundo");
			System.out.println("Introduce otra vez los valores");
			num1=teclado.nextInt();
			System.out.println("Introduce otra vez los valores");
			num2=teclado.nextInt();
		}
		for (int k=num1; k<=num2; k=k+1){
			if (k>=0 && k<10){
				cont=cont+1;
				if(k%2==0){
					contpar=contpar+1;
				}
			}
			
		}
		System.out.println("Hay " + cont + " numeros naturales");
		System.out.println("Hay " + contpar + " numeros pares");
	}
}
