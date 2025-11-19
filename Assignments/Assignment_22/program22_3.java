package Assignment_22;
//  Accept N numbers from user and check whether that numbers contains 11 in it or not 

import java.util.Scanner;

class MyArray {

    private int Arr[];
    private int iSize;
    private int iNumber;

    public MyArray(int iNo, int iNum) {

        iSize = iNo;
        Arr = new int[iSize];
        iNumber = iNum;
    }

    public void Accept() {
        Scanner sc = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter the array elements you want : ");

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            Arr[iCnt] = sc.nextInt();
        }

    }

    public void Display() {
        int iCnt = 0;
        System.out.println("The Array Elements Are : ");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            System.err.printf(Arr[iCnt] + "\t");
        }

    }

    public boolean Check_11() {
        int iCnt = 0;
        boolean bFlag = false;

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            if (Arr[iCnt] == iNumber) {
                bFlag = true;

            }

        }
        return bFlag;

    }
}

public class program22_3 {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iNumber = 0;
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        System.out.println("Enter the elements that you want check :");
        iNumber = sobj.nextInt();

        MyArray aObj = new MyArray(iValue, iNumber);
        aObj.Accept();
        aObj.Display();

        boolean bRet = false;
        bRet = aObj.Check_11();

        if (bRet == true) {
            System.out.println("\nArray elements contains " + iNumber);
        } else {
            System.out.println("\nArray elements does not contains " + iNumber);
        }

        sobj=null;
        aObj=null;
        System.gc();

    }

}
