package Assignment_19;
////////////////////////////////////////////////////////////////////////////////////////
//
//	Write a program to display the grade of student based on marks
//
////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class Logic19_2 {
	public void DisplayGrade(int iMarks) {
		int iGrace = 0;

		if (iMarks < 0) {
			iMarks = -iMarks;
		}

		if (iMarks < 40) {

			if (iMarks >= 35  ) {
				iGrace = 40 - iMarks;
				iMarks = iMarks + iGrace;
				System.out.println(iMarks + " : Grace Passed.");
			} else {
				System.out.println(iMarks + " : Failed .");

			}
		} 
		else if (iMarks >= 40 && iMarks < 60) 
		{
			System.out.println(iMarks + " : C Grade.");

		}
		else if (iMarks >= 60 && iMarks < 80) 
		{
			System.out.println(iMarks + " : B Grade.");
		}
		else
		{
			System.out.println(iMarks + " : A Grade.");

		}

	}
}

public class program19_2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		
		System.out.println("Enter the marks : ");
		iValue = sc.nextInt();

		Logic19_2 ob = new Logic19_2();

		ob.DisplayGrade(iValue);

	}

}
