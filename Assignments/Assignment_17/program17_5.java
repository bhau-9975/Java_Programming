
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to print the table of given number
//
/////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_17;

import java.util.*;

class Logic17_5 {

	public void Table(int iNo) {

		int iCnt = 0, iTab = 1;
		for (iCnt = 1; iCnt <= 10; iCnt++) {
			iTab = iCnt * iNo;
			System.out.printf(iTab + "\t");
		}
	}

}

public class program17_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;

		System.out.println("Enter first number : ");
		iValue = sc.nextInt();

		Logic17_5 ob = new Logic17_5();

		ob.Table(iValue);

	}
}
