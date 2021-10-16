import java.util.Scanner;

public class AppVer2 {
	
	static float handleInput(String prompt) {
		Scanner sc = new Scanner(System.in);
		float userInput;
		System.out.print("Nhap a: ");
		userInput = sc.nextFloat();
		return userInput;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, c;
		
		a = handleInput("Nhap a: ");
		b = handleInput("Nhap a: ");
		c = handleInput("Nhap a: ");

//		Xet tam giac
		boolean isTriangle = false;
		boolean isSquareTriangle = false;
		if (a < b + c && b < a + c && c < a + b) {
			isTriangle = true;
			float max = Math.max(Math.max(a, b), c);

			if (max == a) {
				if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
					isSquareTriangle = true;
				}
			} else if (max == b) {
				if (Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
					isSquareTriangle = true;
				}
			} else {
				if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
					isSquareTriangle = true;
				}
			}
		}

		if (isSquareTriangle) {
			System.out.println("Day la tam giac vuong");
		} else if (isTriangle) {
			System.out.println("Day la tam giac");
		} else {
			System.out.println("Day khong phai la mot tam giac");
		}

	}

}
