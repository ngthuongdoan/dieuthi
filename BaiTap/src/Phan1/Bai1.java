package Phan1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a;
		System.out.print("Nhap a: ");
		a = scan.nextInt();
		boolean isPositive = true;
		if (a <= 0)
			isPositive = false;
		
		if(isPositive) {
			System.out.println("Day la so nguyen duong");
		} else {
			System.out.println("Day la so nguyen am");
		}
	}

}
