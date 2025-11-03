
/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Write a program to check whether the given number is even or odd
//
/////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_16;

import java.util.*;

class Logic16_2 {

	public void CheckEvenOdd(int iNo) {

		if ((iNo%2) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");

		}

	}

}

public class program16_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;

		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic16_2 ob = new Logic16_2();

		ob.CheckEvenOdd(iValue);
	}
}
