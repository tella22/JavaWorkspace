import java.util.Scanner;

public class H3Ej17 {

	public static void main(String[] args) {
		
		int num;
		int num2;
		int cont=0;
		int suma=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un valor");
		num=teclado.nextInt();
		System.out.println("Introduce otro valor");
		num2=teclado.nextInt();
		
		while(num>num2){
			System.out.println("el primero debe ser menor al segundo");
			System.out.println("Introduce otra vez los valores");
			num=teclado.nextInt();
			System.out.println("Introduce otra vez los valores");
			num2=teclado.nextInt();
		}
		for (int k=num; k<=num2; k=k+1){
			if (k%2==0){
				System.out.println(k+" es multiplo de 2");
				cont=cont+1;
				suma=suma +k;
			}

		}
		System.out.println("Hay " + cont + " multiplos de 2");
		System.out.println("La suma total es " + suma);
	}

}
