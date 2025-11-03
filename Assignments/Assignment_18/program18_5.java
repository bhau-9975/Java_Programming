package Assignment_18;
////////////////////////////////////////////////////////////////////////////////////////
//
//	Write a program to check if the number is positive, negative or zero
//
////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic18_5 {

	public void CheckPositiveOrNegative(int iNo) {

		if (iNo > 0) {
			System.out.println("Number is Positive.");

		} else if (iNo == 0) {
			System.out.println("Number is Zero.");

		} else {
			System.out.println("Number is Negative.");
		}

	}
}

public class program18_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		System.out.println("Enter the number : ");
		iValue = sc.nextInt();

		Logic18_5 ob = new Logic18_5();
		
		ob.CheckPositiveOrNegative(iValue);
		
		
	}
}
