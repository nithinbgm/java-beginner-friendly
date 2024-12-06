package org.telusko;

import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int n =low;n<=high;n++){
             int cnt =0;
             //try to divide n and increase cnt
             for(int div = 2;div*div <= n;div++){
                 if(n%div ==0){
                     cnt++;
                     break;
                 }
             }// //try to divide n and increase cnt

        if(cnt == 0) {
            System.out.println(n);
        }
        }
    }
}
