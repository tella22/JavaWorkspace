import java.util.Scanner;

public class Strings07 {

	public static void main(String[] args) {
		
		String frase;
		final int max_length=80;
		String may="ABCDEFGHJIKLMN�OPQRSTUVWXYZ";
		String min="abcdefghijklmn�opqrstuvwxyz";
		String nums="0123456789";
		int pos=0;
		int contmin=0;
		int contmay=0;
		int contnum=0;

		Scanner teclado = new Scanner(System.in);
		do{
			System.out.println("La frase debe tener como maximo " + max_length + " caracteres");
			frase=teclado.nextLine();
		}while (frase.length()>max_length);

		for (int cont=0; cont<frase.length(); cont++){
			char caracter = frase.charAt(pos);
			if(may.indexOf(caracter) != -1){
				contmay=contmay+1;
			}else if(min.indexOf(caracter) != -1){
				contmin=contmin+1;
			}else if(nums.indexOf(caracter) != -1){
				contnum=contnum+1;
			}
			pos++;		
		}
		System.out.println("Tiene " + contnum + " numeros");			
		System.out.println("Tiene " + contmay + " mayusculas");			
		System.out.println("Tiene " + contmin + " minusculas");
		
		teclado.close();
	}

}
