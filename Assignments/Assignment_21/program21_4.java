package Assignment_21;
//Write a program to display all the factors of the given number

import java.util.Scanner;

class Logic21_4 {

	public int CountFactors(int iNo) {
		int iCnt = 0, iCount = 0;

		for (iCnt = 1; iCnt <= (iNo / 2); iCnt++) {
			
			if ((iNo % iCnt) == 0) {
				iCount++;
			}
		}
		return iCount;
	}
}

public class program21_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		System.out.println("Enter the number : ");

		iValue = sc.nextInt();

		Logic21_4 obj = new Logic21_4();

		int iRet = obj.CountFactors(iValue);
		System.out.println("Count of the factors of " + iValue + " is : " + iRet);
	}
}
