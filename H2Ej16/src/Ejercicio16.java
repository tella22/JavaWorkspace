import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		
		int num=0;
		int base=0;
		int altura=0;
		int area=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo del area del: ");
		System.out.println("1 Triangulo");
		System.out.println("2 Cuadrado");
		System.out.println("3 Rectangulo");
		System.out.println("0 Salir");
		num=teclado.nextInt();
		
		while (num<0 || num>3){
			System.out.println("valor introducido no valido,introducelo otra vez: ");
			num=teclado.nextInt();
		}	
		switch (num){
		case 1: 
			System.out.println("Introduce la base");
			base=teclado.nextInt();
			System.out.println("Introduce la altura");
			altura=teclado.nextInt();
			area=base*altura/2;
			System.out.println("El area del triangulo es: "+area);
			break;
		case 2:
			System.out.println("Introduce el lado del cuadrado");
			altura=teclado.nextInt();
			area=altura*altura;
			System.out.println("El area del cuadrado es: "+area);
			break;
		case 3:
			System.out.println("Introduce la base del rectangulo");
			base=teclado.nextInt();
			System.out.println("Introduce la altura del rectangulo");
			altura=teclado.nextInt();
			area=base*altura;
			System.out.println("El area del rectangulo es: "+area);
		case 0:
			break;
		}	
		
	}
}
