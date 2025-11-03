package Assignment_19;
////////////////////////////////////////////////////////////////////////////////////////
//
//	Write a program to check whether the number is divisible by 5 and 11 or not
//
////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic19_3 {

	public boolean CheckDivisibleOrNot(int iNum, int iDiv1, int iDiv2) {
		
		boolean bFlag = false;

		if (iNum < 0) {
			iNum = -iNum;
		}

		if ((iNum % iDiv1) == 0 && (iNum % iDiv2) == 0) {
			bFlag = true;
		}

		return bFlag;
	}

}

public class program19_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0, iDivisor1 = 0, iDivisor2 = 0;
		boolean bRet = false;
		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		System.out.println("Enter first divisor : ");
		iDivisor1 = sc.nextInt();
		System.out.println("Enter second divisor : ");
		iDivisor2 = sc.nextInt();

		Logic19_3 ob = new Logic19_3();

		System.out.println(ob.CheckDivisibleOrNot(iValue, iDivisor1, iDivisor2)?"Divisible.":"Not Divisible.");
		

	}
}
