import java.util.Scanner;
public class H3Ej11 {

	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una frase ");
		num=teclado.nextInt();	
		
		for(int k=1; k<=num; k=k+1){
			if(k%3==0){
				System.out.println(k + " es multiplo de 3");
			}
		}
	}

}
