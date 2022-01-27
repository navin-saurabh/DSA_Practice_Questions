package com.example.towerofhanoi;

import java.util.*;

public class TowerOfHanoi {

    public static void toh(int n,int A,int B,int C)
    {
     if(n==0)
     {
         return;
     }
     toh(n-1,A,C,B);
        System.out.println(n +"["+A + " -> " + B + "]");
        toh(n-1,C,B,A);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("total number of disks:");
        int n=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();

        toh(n,A,B,C);
    }
}
