import java.util.Scanner;

public class App {

//	[Pham vi] [Loai] <Kieu tra ve> <tenHam>(...[Tham so]){}
//	- Pham vi: public/protected/default/private
//	- Loai: static

	static float getUserInput(String p) {
		Scanner sc = new Scanner(System.in);
		float userInput;

		System.out.print(p);
		userInput = sc.nextFloat();
		return userInput;
	}

	static boolean SquareTriangle(float a, float b, float c) {
		float max = Math.max(Math.max(a, b), c);

		float a2 = (float) Math.pow(a, 2);
		float b2 = (float) Math.pow(b, 2);
		float c2 = (float) Math.pow(c, 2);
		if (max == a) {
			if (a2 == b2 + c2) {
				return true;
			}
		} else if (max == b) {
			if (b2 == a2 + c2) {
				return true;
			}
		} else if (c2 == a2 + b2) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b, c;

		a = getUserInput("Nhap a: ");
		b = getUserInput("Nhap b: ");
		c = getUserInput("Nhap c: ");

//		Xet tam giac
		boolean isTriangle = false;
		boolean isSquareTriangle = false;
		if (a < b + c && b < a + c && c < a + b) {
			isTriangle = true;
			isSquareTriangle = SquareTriangle(a, b, c);
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
