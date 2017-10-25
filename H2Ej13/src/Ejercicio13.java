import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int num;
		int k;
		int suma=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		num=teclado.nextInt();
		
		for (k=1; k<num; k=k+1){
			if (num % k == 0){
				suma=suma+k;
			}
		}
		
		if (num==suma){
			System.out.println("el numero " + num + " es perfecto");
		}else {
			System.out.println("el numero " + num + " no es perfecto");
		}
		
	}//main

}//class
