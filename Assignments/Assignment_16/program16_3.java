
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to find factorial of the given number
//
/////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_16;

import java.util.*;

class Logic16_3 {

	public int Factorial(int iNo) {

		int iCnt = 0, iFact = 1;

		for (iCnt = iNo; iCnt >= 1; iCnt--) {
			iFact = iFact * iCnt;
		}
		return iFact;

	}

}

public class program16_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0, iRet = 0;

		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic16_3 ob = new Logic16_3();

		iRet = ob.Factorial(iValue);
		System.out.println("Factorial of " + iValue + " is : " + iRet);
	}
}
