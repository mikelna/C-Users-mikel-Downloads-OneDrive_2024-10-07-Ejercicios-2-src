import java.util.Scanner;

public class T2EJ6 {

	
	public static void main(String[] args) {

		
		//numero variable
		int num1;
		int num2;
		int num3;
		
		
		
		
		//pedir numero
		System.out.println();
		
		//leer numero
		Scanner sc = new Scanner(System.in);
		//leer numeros
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//si num1 mayor num2
		//mostrar num1 num2
		//sino si num1 mayor num1
		//mostrar num2 num1
		//sino
		if (num1 > num2 > num3 && num1 < num2 < num3){
			System.out.println(num1 > num2 > num3);
			System.out.println(num1 < num2 < num3);
		}else if (num2 > num3 > num1){
			System.out.println(num2 > num3 > num1);
			System.out.println(num2 > num1 > num3);
		}else {
			
			
		}
			
	
		}
}
