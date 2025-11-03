package Assignment_21;

import java.util.Scanner;

//	Write a program to calculate the product of digits of the given number

class Logic21_1 {
	public void CalculateProduct(int iNo) {

		int iDigit = 0, iTemp = iNo, iProduct = 1;

		while (iTemp != 0) {
			iDigit = iTemp % 10;

			iProduct = iProduct * iDigit;

			iTemp = iTemp / 10;

		}
		System.out.println("Product is : " + iProduct);
	}
}

public class program21_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iValue = 0;

		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic21_1 obj = new Logic21_1();

		obj.CalculateProduct(iValue);

	}

}
