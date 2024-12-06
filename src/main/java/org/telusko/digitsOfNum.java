package org.telusko;

import java.util.Scanner;

public class digitsOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int numOfDigits = 0;
        int temp = n;
        while(temp!=0){
            temp = temp/10;
            numOfDigits++;
        }
        int div = (int)Math.pow(10,numOfDigits-1);
        while(div !=0){
            int q = n/div;
            System.out.println(q);

            n=n%div;
            div = div/10;

        }
    }
}
