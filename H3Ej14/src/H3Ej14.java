import java.util.Scanner;

public class H3Ej14 {

	public static void main(String[] args) {
		
		int num;
		int cont=0;
		int max=0;
		int min=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		
		max=num;
		min=num;
		
		cont=cont+1;
		
		while (cont<5){
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
			
			if(num > max){
				max=num;
			}else if(num<min){
				min=num;
			}
			cont=cont+1;
		}
		System.out.println("El mayor es "+max);
		System.out.println("El menor es "+min);
	}

}
