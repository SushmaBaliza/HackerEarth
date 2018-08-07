package main;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c=1;
        for(i=n;i>=1;i--)
        {
            c=c*i;

        }
        System.out.println(c);

    }
}
