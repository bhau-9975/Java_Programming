package Assignment_20;
///////////////////////////////////////////////////////////////////////////////////

//
//	Write a program to print the numbers from N down to 1 in reverse order
//
///////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic20_2 {
	public void PrintReverse(int iNo) {

		int iCnt = 0;

		if (iNo < 0) {
			iNo = -iNo;
		}

		for (iCnt = iNo; iCnt >= 1; iCnt--) {
			System.out.printf(iCnt+"\t");

		}

	}

}

public class program20_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;

		System.out.println("Enter the N : ");
		iValue = sc.nextInt();

		Logic20_2 ob = new Logic20_2();

		ob.PrintReverse(iValue);
	}
}
