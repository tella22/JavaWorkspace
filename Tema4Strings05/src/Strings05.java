import java.util.Scanner;

public class Strings05 {

	public static void main(String[] args) {
		
		String frase;
		String par="";
		String impar="";
		String pos="";
		final int max_length=80;
		
		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La palabra debe tener como maximo " + max_length + " caracteres");
			frase=teclado.nextLine();
		}while (frase.length()>max_length);
		
		for(int cont=0; cont<frase.length(); cont++){
			if (cont%2==0){
				par = par + frase.substring(cont, cont+1);
			}else {
				impar = impar + frase.substring(cont, cont+1);
			}
		}
		System.out.println(par);
		System.out.println(impar);
		
	}
}


