
public class H3Ej05 {

	public static void main(String[] args) {
	int cont=0;
		for (int k=0; k<101; k=k+1){
			if (k%2==1) {
				cont=cont+1;
				System.out.println(k + " es impar");
			}
		}
		System.out.println("Hay " + cont + " numeros impares");
	}

}
