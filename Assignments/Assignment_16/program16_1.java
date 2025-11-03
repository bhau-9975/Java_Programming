package Assignment_16;

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to calculate the sum of first N natural numbers
//
/////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Logic {

	static int CalculateSum(int iNo) {

		int iCnt = 0, iSum = 0;

		for (iCnt = 1; iCnt <= iNo; iCnt++) {
			iSum = iSum + iCnt;
		}
		return iSum;
	}

}

public class program16_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0, iRet = 0;
		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic ob = new Logic();

		iRet = ob.CalculateSum(iValue);
		System.out.println("Sum is : " + iRet);
	}
}
