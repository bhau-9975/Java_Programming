package Assignment_18;

import java.util.Scanner;

////////////////////////////////////////////////////////////////////////////////////////
//
//	Write a program to print sum of even and odd digits in number separately
//
////////////////////////////////////////////////////////////////////////////////////////

class Logic18_4 {

	public void Sum(int iNo) {

		int iDigit = 0, iSumEven = 0, iSumOdd = 0, iTemp = iNo;

		while (iTemp != 0) {

			iDigit = iTemp % 10;
			if ((iDigit % 2) == 0) {
				iSumEven = iSumEven + iDigit;
			} else {
				iSumOdd = iSumOdd + iDigit;
			}

			iTemp = iTemp / 10;

		}
		System.out.println("Sum of even digits is : " + iSumEven + "\nSum of odd digits is : " + iSumOdd);

	}

}

public class program18_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic18_4 ob = new Logic18_4();

		ob.Sum(iValue);

	}
}
