import java.util.Scanner;

public class T1EJ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				//variables
				int num1;
				int num2;
				boolean esPositivo;
				//boolean numIguales;
				
				//pedir introducir numero
				//System.out.print("Introduce numero entero:");
				System.out.println();
				System.out.println();

				
				//leer
				Scanner sc = new Scanner(System.in);
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				
				//numeros iguales
				//numIguales = (num1 == num2);
				
				
				//Es Positivos
								
				esPositivo = (num1 >= 0 || num2 >= 0) || (num1 == num2);
				if (esPositivo){
					System.out.println(esPositivo);
				}else{
					
				}
				}

}

//}else if (esPositivo) {
	//System.out.println(esPositiv