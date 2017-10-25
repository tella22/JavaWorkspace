import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int num;
		int cont=0;
		int sumapar=0;
		int sumaimpar=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		while (num != 0){
			
			cont=cont+1;
			
			if (cont % 2 == 0){
				
				sumapar=sumapar+num;
				
			}else{
				sumaimpar=sumaimpar+num;
			}
			
			System.out.println("Escribe un numero: ");
			num=teclado.nextInt();
		}
		
			System.out.println("El total de suma en lugar par es " + sumapar);
			System.out.println("El total de suma en lugar impar es " + sumaimpar);

	}

}
