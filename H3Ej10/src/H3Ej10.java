import java.util.Scanner;

public class H3Ej10 {

	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase ");
		num=teclado.nextInt();	
		
		if (num % 2 == 0){
			System.out.println(num + " es par");
		}else {
			System.out.println(num + " es impar");
		}
	}

}
