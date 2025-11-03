package Assignment_21;

import java.util.Scanner;

// Write a program to display all the factors of the given number

class Logic21_3 {

	public void DisplayFactors(int iNo) {
		int iCnt = 0;

		for (iCnt = 1; iCnt <= (iNo / 2); iCnt++) {
			if ((iNo % iCnt) == 0) {
				System.out.printf(iCnt + "\t");
			}

		}

	}
}

public class program21_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		System.out.println("Enter the number : ");

		iValue = sc.nextInt();

		Logic21_3 obj = new Logic21_3();
		obj.DisplayFactors(iValue);
	}
}
