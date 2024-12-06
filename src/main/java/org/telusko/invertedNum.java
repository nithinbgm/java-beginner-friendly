package org.telusko;

import java.util.Scanner;

public class invertedNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inverted=0;
        int op = 1;//original postion
        while(n!=0){
            int od = n%10;
            int id = op;
            int ip= od;

            //make change to inv using ip and id
            inverted = inverted+id*(int)Math.pow(10,ip-1);

            n=n/10;
            op++;
        }
        System.out.println(inverted);

    }
}
