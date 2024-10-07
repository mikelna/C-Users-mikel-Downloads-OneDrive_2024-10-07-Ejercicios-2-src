import java.util.Scanner;

public class T2EJ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num;
		
		System.out.println("Introduce numero entero:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if (num >= 0) {
			System.out.println("El numero es positivo");
		}else { 
			System.out.println("El numero es negativo");
		}

	}

}
