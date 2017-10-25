import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		
		int num;
		int cont=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un valor: ");
		num=teclado.nextInt();
		
		while (num<0){
			System.out.println("Valor introducido menor a 0, introduce un valor: ");
			num=teclado.nextInt();
		}
		
		for (int k=1; k<=num; k=k+1){
			cont=0;
			for (int div=2; div<k; div=div+1){
				if(k % div == 0){
					cont=cont+1;
				}
			}
			if (cont == 0){
				System.out.println("Hemos encontrado un primo: " + k);
			}
		}
		
	}

}
