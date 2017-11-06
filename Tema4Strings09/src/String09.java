import java.util.Scanner;

public class String09 {

	public static void main(String[] args) {

		int conthprim=0;
		int contmprim=0;
		int conthseg=0;
		int contmseg=0;
		int contcor=0;

		Scanner teclado = new Scanner(System.in);

		boolean byear, bsexo, bcurso;

		String codigo;

		System.out.println("introduce el código");
		codigo=teclado.nextLine();

		while(!codigo.equals("00000000")){
			byear = bsexo = bcurso = false;
			if (codigo.substring(0, 4).compareTo("1990")>=0 && codigo.substring(0, 4).compareTo("1995")<=0){
				byear=true;
			}
			if(codigo.charAt(4)=='H' || codigo.charAt(4)=='M'){
				bsexo=true;
			}
			if(codigo.charAt(5)=='1' || codigo.charAt(5)=='2'){
				bcurso=true;
			}
			if(byear == bsexo == bcurso == true){
				contcor=contcor+1;
				if(codigo.charAt(4)=='H'&& codigo.charAt(5)=='1'){
					conthprim=conthprim+1;
				}else if(codigo.charAt(4)=='H'&& codigo.charAt(5)=='2'){
					conthseg=conthseg+1;
				}
				if(codigo.charAt(4)=='M'&& codigo.charAt(5)=='1'){
					contmprim=contmprim+1;
				}else if(codigo.charAt(4)=='M'&& codigo.charAt(5)=='2'){
					contmseg=contmseg+1;
				}
			}	
			System.out.println("introduce el código");
				codigo=teclado.nextLine();
		}

		System.out.println("Hay " + conthprim + " hombres en primero");
		System.out.println("Hay " + conthseg + " hombres en segundo");
		System.out.println("Hay " + contmprim + " mujeres en primero");
		System.out.println("Hay " + contmseg + " mujeres en segundo");
		System.out.println("Hay " + contcor + " codigos correctos");

		teclado.close();	
	}
}
