import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 9;
//		int b = 10;
//		System.out.println(a + b);		
		float a, b;
		Scanner scan = new Scanner(System.in);
		
		// Nhap a: ....
		System.out.print("Nhap a: ");
		a = scan.nextInt();
		
		// Nhap b: ....
		System.out.print("Nhap b: ");
		b = scan.nextInt();
		
		System.out.println(a + b);
	}
}
