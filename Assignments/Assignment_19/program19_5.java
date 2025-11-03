package Assignment_19;

import java.util.Scanner;

class Logic19_5 {

	public int CalculatePower(int iBase, int iExp) {
		int iCnt = 0, iPower = 1;

		if (iBase < 0) {
			iBase = -iBase;
		}
		if (iExp < 0) {
			iExp = -iExp;
		}

		for (iCnt = 1; iCnt <= iExp; iCnt++) {
			iPower = iPower * iBase;
		}

		return iPower;

	}
}

public class program19_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue1 = 0, iValue2 = 0, iRet = 0;
		System.out.println("Enter the base : ");
		iValue1 = sc.nextInt();

		System.out.println("Enter the exponent : ");
		iValue2 = sc.nextInt();

		Logic19_5 ob = new Logic19_5();

		iRet = ob.CalculatePower(iValue1, iValue2);
		System.out.println("Power of " + iValue1 + " is " + iRet);
	}
}

