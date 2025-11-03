
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to check whether the number is palindrome or not
//
/////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_17;

import java.util.*;

class Logic17_2 {

	public boolean CheckPalindrome(int iNo) {

		int iDigit = 0, iRev = 0, iTemp=iNo;

		while (iTemp != 0) {

			iDigit = iTemp % 10;
			iRev = (iRev*10) +  iDigit;
			iTemp = iTemp / 10;
		}

		System.out.println("Reverse : " + iRev);

		if (iNo == iRev) {
			return true;
		} else {
			return false;
		}
	}

}

public class program17_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		boolean bRet = false;

		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic17_2 ob = new Logic17_2();

		bRet = ob.CheckPalindrome(iValue);

		if (bRet == true) {
			System.out.println("Number is palindrome...!");
		} else {
			System.out.println("Number is not palindrome...!");

		}
	}
}
