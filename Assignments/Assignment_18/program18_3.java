package Assignment_18;

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////
//
//	Write a program to print all odd numbers up to N
//
////////////////////////////////////////////////////////////////////////////////////////

class Logic18_3 {

	public void PrintOdd(int iN) {

		int iCnt = 0;

		for (iCnt = 1; iCnt <= iN; iCnt++) { // here we can also use short hand increment
			if ((iCnt % 2) != 0) {
				System.out.printf(iCnt + "\t");
			}
		}

	}
}

public class program18_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		System.out.println("Enter the value of N : ");
		iValue = sc.nextInt();

		Logic18_3 ob = new Logic18_3();

		ob.PrintOdd(iValue);

	}
}
