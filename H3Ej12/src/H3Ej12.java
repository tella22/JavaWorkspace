
public class H3Ej12 {

	public static void main(String[] args) {
		
		int sumapar=0;
		int sumaimpar=0;
		
		for (int k=0; k<101; k=k+1){
			if (k%2==0){
				sumapar=sumapar+k;
			}else{
				sumaimpar=sumaimpar+k;
			}
		}
		System.out.println("La suma par es: " + sumapar);
		System.out.println("La suma par es: " + sumaimpar);
	}
}
