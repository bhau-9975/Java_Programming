package Assignment_19;


////////////////////////////////////////////////////////////////////////////////////////
//
//	Write a program to check whether the given year is leap year or not
//
////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

class Logic19_1 {
	public boolean CheckLeapYear(int iYear) {
		boolean bFlag = false;
		if (iYear < 0) {		// Updater
			iYear = -iYear;
		}

		if ((iYear % 400) == 0 || (iYear % 4) == 0 && (iYear % 100) != 0) {
			bFlag = true;
		}

		return bFlag;

	}

}

public class program19_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		boolean bRet = false;
		System.out.println("Enter the year : ");
		iValue = sc.nextInt();

		Logic19_1 ob = new Logic19_1();

		bRet = ob.CheckLeapYear(iValue);
		if (bRet == true) {
			System.out.println(iValue + " is leap year.");
		} else {
			System.out.println(iValue + " is leap year.");

		}

	}

}
