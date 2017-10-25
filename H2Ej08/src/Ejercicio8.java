import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		int p;
		int q;
		int contq=0;
		int contp=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		q=teclado.nextInt();
		
		while (q<1){
			System.out.println("El numero es negativo, introducelo otra vez: ");
			q=teclado.nextInt();
		}
		
		System.out.println("Escribe un numero: ");
		p=teclado.nextInt();
		
		while (p<1){
			System.out.println("El numero es negativo, introducelo otra vez: ");
			p=teclado.nextInt();
		}
		
		for (int k=1; k<= p; k=k+1){
			if (p % k == 0){
				contp=contp+1;
			}
		}
				
		for (int j=1; j<= q; j=j+1){
			if (q % j == 0){
				contq=contq+1;
			}
		}	
		
		if (contp>contq){
			System.out.println(p + " tiene más divisores que " + q);
		}else {
			System.out.println(q + " tiene más divisores que " + p);
		}
		
		}

	}
