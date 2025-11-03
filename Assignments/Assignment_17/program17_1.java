
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to find the sum of digits of numbers
//
/////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_17;

import java.util.*;

class Logic17_1 {

	public int SumOfDigits(int iNo) {

		int iDigit = 0, iSum = 0;

		while (iNo != 0) {

			iDigit = iNo % 10;
			iSum = iSum + iDigit;
			iNo = iNo / 10;
		}
		return iSum;
	}

}

public class program17_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0, iRet = 0;

		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic17_1 ob = new Logic17_1();

		iRet = ob.SumOfDigits(iValue);
		System.out.println("Sum of digit is : " + iRet);
	}
}
