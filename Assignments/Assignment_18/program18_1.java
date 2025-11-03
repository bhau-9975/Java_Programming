package Assignment_18;

////////////////////////////////////////////////////////////////////////////////////////
//
//	Write a program to check whether the number is prime or not
//
////////////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;

class Logic18_1 {
	public boolean CheckPrime(int iNo) {
		int iCnt = 0;
		boolean bFlag = false;
		
		if (iNo < 0) {		// Updater
			iNo = -iNo;
		}

		for (iCnt = 2, bFlag = true; iCnt <= (iNo / 2); iCnt++) {
			if ((iNo % iCnt) == 0) {

				bFlag = false;
				break;
			}

		}

		return bFlag;
	}
}

public class program18_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		boolean bRet = false;
		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic18_1 obj = new Logic18_1();
		bRet = obj.CheckPrime(iValue);

		if (bRet == true) {
			System.out.println(iValue + " is Prime number.");
		} else {
			System.out.println(iValue + " is not Prime number.");
		}
	}

}
