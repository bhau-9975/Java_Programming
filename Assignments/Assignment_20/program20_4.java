package Assignment_20;

// Write a program to find the largest digit in the given number
import java.util.Scanner;

class Logic20_4 {

	public int FindLargestDigit(int iNo) {
		int iDigit = 0, iTemp = iNo, iLargest = 0;

		while (iTemp != 0) {
			iDigit = iTemp % 10;
			if (iDigit > iLargest) {
				iLargest = iDigit;
			}
			iTemp=iTemp/10;

		}
		return iLargest;

	}

}

public class program20_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0, iRet = 0;

		System.out.println("Enter the number : ");

		iValue = sc.nextInt();

		Logic20_4 obj = new Logic20_4();

		iRet = obj.FindLargestDigit(iValue);
		System.out.println("Largest digit is : " + iRet);
	}
}
