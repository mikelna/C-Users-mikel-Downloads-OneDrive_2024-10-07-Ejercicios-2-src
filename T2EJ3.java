import java.util.Scanner;

public abstract class T2EJ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//variable
		int num;
		//pedir num
		System.out.println();
		System.out.println();
	
		//leer numeros
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//si resto num entre dos
		//mostrar Par
		//sino si resto num no es 0
		//mostrar Impar
		//sino
		if (num % 2 == 0){
			System.out.println("Par");
		}else if (num % 2 != 0) {
			System.out.println("Impar");
		}else{
		}
		
	}

}
