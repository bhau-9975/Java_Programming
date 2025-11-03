
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to find the minimum of three numbers
//
/////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_17;

import java.util.*;

class Logic17_4 {

	public void FindMin(int iNo1, int iNo2, int iNo3) {

		if (iNo1 < iNo2) {
			if (iNo1 < iNo3) {
				System.out.println(iNo1 + " : iNo1 is Minimum");
			} else {
				System.out.println(iNo3 + " : iNo3 in Minimum");
			}

		} else {
			if (iNo2 > iNo3) {
				System.out.println(iNo3 + " : iNo3 is Minimum");
			} else {
				System.out.println(iNo2 + " : iNo2 is Minimum");
			}
		}
	}

}

public class program17_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue1 = 0, iValue2 = 0, iValue3 = 0;

		System.out.println("Enter first number : ");
		iValue1 = sc.nextInt();

		System.out.println("Enter second number : ");
		iValue2 = sc.nextInt();

		System.out.println("Enter third number : ");
		iValue3 = sc.nextInt();

		Logic17_4 ob = new Logic17_4();

		ob.FindMin(iValue1, iValue2, iValue3);

	}
}
