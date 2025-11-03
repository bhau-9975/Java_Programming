
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to find the maximum of two numbers
//
/////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_17;

import java.util.*;

class Logic17_3 {

	public void FindMax(int iNo1, int iNo2) {

		if (iNo1 < iNo2) {
			System.out.println(iNo2 + " is Maximum.");
		} else if (iNo2 == iNo1) {
			System.out.println(" Both are the same.");
		} else {
			System.out.println(iNo1 + " is Maximun.");
		}
	}

}

public class program17_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue1 = 0, iValue2 = 0;

		System.out.println("Enter first number : ");
		iValue1 = sc.nextInt();

		System.out.println("Enter second number : ");
		iValue2 = sc.nextInt();

		Logic17_3 ob = new Logic17_3();

		ob.FindMax(iValue1, iValue2);

	}
}
