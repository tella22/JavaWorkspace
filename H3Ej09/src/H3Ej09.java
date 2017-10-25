import java.util.Scanner;

public class H3Ej09 {

	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero ");
		num=teclado.nextInt();	
		
		if (num<0){
			System.out.println(num + " es negativo");
		}else{
			System.out.println(num + " es positivo");
		}
	}

}
