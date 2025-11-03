package Assignment_19;

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////
//
//Write a program to print each digit of the number separately
//
////////////////////////////////////////////////////////////////////////////////////////
class Logic19_4 {

	public void PrintDigits(int iNo) {

		if (iNo < 0) {
			iNo = -iNo;
		}

		int iDigit = 0, iTemp = iNo;

		while (iTemp != 0) {
			iDigit = iTemp % 10;
			System.out.printf(iDigit + "\t");
			iTemp = iTemp / 10;
		}

	}
}

public class program19_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic19_4 ob = new Logic19_4();
		
		ob.PrintDigits(iValue);
	}
}