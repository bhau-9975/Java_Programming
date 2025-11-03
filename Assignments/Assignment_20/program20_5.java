package Assignment_20;

import java.util.Scanner;

//Write a program to find the smallest digit in the given number
class Logic20_5 {

	public int FindSmallestDigit(int iNo) {
		int iDigit = 0, iTemp = iNo, iSmallest = 9;

		while (iTemp != 0) {
			iDigit = iTemp % 10;
			if (iDigit < iSmallest) {
				iSmallest = iDigit;
			}
			iTemp = iTemp / 10;

		}
		return iSmallest;

	}

}

public class program20_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0, iRet = 0;

		System.out.println("Enter the number : ");

		iValue = sc.nextInt();

		Logic20_5 obj = new Logic20_5();

		iRet = obj.FindSmallestDigit(iValue);
		System.out.println("Smallest digit is : " + iRet);
	}
}
