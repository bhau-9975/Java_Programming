package Assignment_21;

// Write a program to print all the numbers from 1 to N which are divisible by 2 and 3 
// Example : Input : 12   Output : 6	12     
import java.util.Scanner;

class Logic21_5 {

	public void PrintDivisibleBy2And3(int iNo) {

		int iCnt = 0;

		for (iCnt = 1; iCnt <= iNo; iCnt++) {
			if ((iCnt % 2) == 0 && (iCnt % 3) == 0) { // printing the numbers which are divisible by both 2 and 3
				System.out.println(iCnt);
			}

		}
	}
}

public class program21_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int iValue = 0;
		System.out.println("Enter the Range : ");

		iValue = sc.nextInt();

		Logic21_5 obj = new Logic21_5();
		obj.PrintDivisibleBy2And3(iValue);

	}
}
