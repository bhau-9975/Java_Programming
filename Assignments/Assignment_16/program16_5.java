
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to count the number of digits given in that number
//
/////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_16;

import java.util.*;

class Logic16_5 {

	public int CountTheDigits(int iNo) {

		int iDigit = 0, iCount = 0;
		
		while (iNo != 0) {

			iDigit = iNo % 10;
			//System.out.printf(iDigit + "\t");
			iCount++;
			iNo = iNo / 10;
		}
		return iCount;
	}

}

public class program16_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0, iRet = 0;

		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic16_5 ob = new Logic16_5();

		iRet = ob.CountTheDigits(iValue);
		System.out.println("Count of digit is : " + iRet);
	}
}
