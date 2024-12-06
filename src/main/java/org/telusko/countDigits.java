package org.telusko;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int digcnt = 0;
        while(n!=0){
            n=n/10;
            digcnt++;
        }
        System.out.println(digcnt);
    }
}
