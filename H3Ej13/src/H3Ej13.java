
public class H3Ej13 {

	public static void main(String[] args) {
		
		int cont2=0; 
		int cont3=0; 
		
		for (int k=0; k<101; k=k+1){
			if (k%2==0){
				cont2=cont2+1;
			}else if (k%3==0){
				cont3=cont3+1;
			}
		}
		
		System.out.println("Hay " + cont2 + " multiplos de 2");
		System.out.println("Hay " + cont3 + " multiplos de 3");
		
	}
}
