import java.util.Scanner;

public class T2EJ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables numeros
		int num1;
		int num2;
		//pedir numeros
		System.out.println();
		//leer numeros
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		//si num1 mayor que num2
		//mostrar el num1
		//sino si num2 mayor que num1
		//mostrar el num2
		//sino ninguna
	
		
		if (num1 > num2){
			System.out.println(num1);
		}else if (num1 < num2){
			System.out.println(num2);
		}else {
		}
	
	}

}
