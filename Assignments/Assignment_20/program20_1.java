package Assignment_20;

import java.util.Scanner;

// Write a program to find the sum of all even numbers up to N

class Logic20_1 {

	public int FindSumEven(int iN) {
		int iCnt = 0, iSum = 0;

		if (iN < 0) {
			iN = -iN;
		}

		for (iCnt = 1; iCnt <= iN; iCnt++) {

			if ((iCnt % 2) == 0) {
				iSum = iSum + iCnt;
			}

		}

		return iSum;

	}
}

public class program20_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0, iRet = 0;

		System.out.println("Enter the N : ");
		iValue = sc.nextInt();

		Logic20_1 ob = new Logic20_1();

		iRet = ob.FindSumEven(iValue);
		System.out.println("Sum of even numbers upto " + iValue + " is : " + iRet);
	}
}
