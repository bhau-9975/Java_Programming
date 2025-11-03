
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to reverse the given number
//
/////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_16;

import java.util.*;

class Logic16_4 {

	public void Reverse(int iNo) {

		int iDigit = 0;
		while (iNo != 0) {

			iDigit = iNo % 10;
			System.out.printf(iDigit + "\t");
			iNo = iNo / 10;
		}

	}

}

public class program16_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;

		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic16_4 ob = new Logic16_4();

		ob.Reverse(iValue);
	}
}
