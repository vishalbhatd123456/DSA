// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;
import java.lang.*;
class HelloWorld {
    
    private static int CalcMaxElementGreaterThanSelf(int [] arr, int n)
    {
        int maxElem = Integer.MIN_VALUE;
        int freq = 0;
        for(int i = 0; i <n;i++)
        {
            if(arr[i] > maxElem)
            {
                maxElem = arr[i];
            }
        }
        //count the freq in array
        
        for(int i = 0; i < n;i++)
        {
            if(arr[i] == maxElem)
            {
                freq++;
            }
        }
        return n-freq;
    }
    
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0; i < n;i++)
        {
            arr[i] = scan.nextInt();
        }
        int res = CalcMaxElementGreaterThanSelf(arr, n);
        System.out.println("the result is"+res);
    }
}