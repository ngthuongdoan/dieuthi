package Phan1;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
		String mssv = new String();
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhap MSSV: ");
		mssv = scan.nextLine();
		boolean isValid = true;

		if (mssv.length() != 9)
			isValid = false;
		if (mssv.charAt(0) != 'B')
			isValid = false;

		for (int i = 1; i < mssv.length(); i++) {
			try {
				int c = mssv.charAt(i) - '0';
			} catch (Exception e) {
				isValid = false;
				break;
			}
		}

		if (isValid) {
			System.out.println("Hop le");
		} else {
			System.out.println("Khong hop le");
		}
	}
}
