package Assignment_20;

import java.util.Scanner;

// Write a program to check the number is perfect or not
// Sum of factors of that number should equals to that number (Eg: 6 : (1+2+3=6) 6 is perfect number

class Logic20_3 {

	public void CheckPerfect(int iNo) {

		int iCnt = 0, iSum = 0;
		boolean bFlag = false;

		for (iCnt = 1; iCnt <= (iNo / 2); iCnt++) {

			if ((iNo % iCnt) == 0) {
				iSum = iSum + iCnt;
			}

		}
		System.out.println("Sum : "+iSum);
		if (iSum == iNo) {
			System.out.println(iNo + " is perfect number.");
		} else {
			System.out.println(iNo + " is not perfect number.");
		}
	}

}

public class program20_3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;

		System.out.println("Enter the number : ");

		iValue = sc.nextInt();

		Logic20_3 obj = new Logic20_3();

		obj.CheckPerfect(iValue);

	}
}
