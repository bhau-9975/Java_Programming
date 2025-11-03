package Assignment_18;

////////////////////////////////////////////////////////////////////////////////////////
//
//	Write a program to print all even numbers up to N
//
////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Logic18_2 {

    public void PrintEven(int iN) {

        int iCnt = 0;

        for (iCnt = 2; iCnt <= iN; iCnt++) { // here we can also use short hand increment
            if ((iCnt % 2) == 0) {
                System.out.printf(iCnt + "\t");
            }
        }

    }
}

public class program18_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the value of N : ");
        iValue = sc.nextInt();

        Logic18_2 ob = new Logic18_2();

        ob.PrintEven(iValue);

    }
}
