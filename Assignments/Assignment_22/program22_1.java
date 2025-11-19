package Assignment_22;
//  Accept N numbers from user and return frequency of even numbers 



import java.util.Scanner;

class MyArray {

    private int Arr[];
    private int iSize;

    public MyArray(int iNo) {

        iSize = iNo;
        Arr = new int[iSize];
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

    public void frequencyOfEvenElements() {
        int iCnt = 0, iCount = 0;
        System.out.println("\nThe Even Elements Are : ");
        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            if ((Arr[iCnt] % 2) == 0) {
                System.err.printf(Arr[iCnt] + "\t");
                iCount++;
            }
        }

        System.out.println("\nFrequency of even elements is : " + iCount);
    }

}

public class program22_1 {

    public static void main(String[] args) {

        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        MyArray aObj = new MyArray(iValue);
        aObj.Accept();
        aObj.Display();
        aObj.frequencyOfEvenElements();



        sobj=null;
        aObj=null;
        System.gc();

    }

}
