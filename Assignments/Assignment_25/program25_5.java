package Assignment_25;

import java.util.Scanner;

// Accept N numbers from user and display all such elements which are multiples of 11
class Myclass {

    private int Arr[];
    private int iLength;

    public Myclass(int iNo) {

        iLength = iNo;
        Arr = new int[iLength];
    }

    public void Accept() {
        Scanner sc = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter the array elements : ");

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            Arr[iCnt] = sc.nextInt();
        }

    }

    public void Display() {
        int iCnt = 0;

        System.out.println("The array elements are : ");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            System.out.printf(Arr[iCnt] + "\t");
        }
    }

    public void DisplayMultipleOf_11() {
        int iCnt = 0;

        System.out.println("\nThe elements divisible by 11 are : ");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            if ((Arr[iCnt] % 11) == 0) {
                System.out.printf(Arr[iCnt] + "\t");

            }
        }
    }

}

public class program25_5 {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        int iSize = 0;

        System.out.println("Enter the number of elements : ");
        iSize = sobj.nextInt();

        Myclass mObj = new Myclass(iSize);
        mObj.Accept();
        mObj.Display();
        mObj.DisplayMultipleOf_11();

    }
}
