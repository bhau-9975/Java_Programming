package Assignment_21;

//	 Write a program to count how many even and odd numbers are present in between 1 and N
import java.util.Scanner;

class Logic21_2 {
	public void CountEvenOdd(int iNo) {

		int iCnt = 0, iCountEven = 0, iCountOdd = 0;
		for (iCnt = 1; iCnt <= iNo; iCnt++) {

			if ((iCnt % 2) == 0) {
				iCountEven++;
			} else {
				iCountOdd++;
			}
		}
		System.out.println("From 1 to " + iNo + " :\nCount of even numbers is : " + iCountEven);
		System.out.println("Count of odd numbers is : " + iCountOdd);

	}

}

public class program21_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		System.out.println("Enter the N : ");

		iValue = sc.nextInt();
		
		Logic21_2 obj = new Logic21_2();
		obj.CountEvenOdd(iValue);
	}
}
