package org.telusko;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int cnt = 0;
            for(int div = 2; div*div <=n;div++ ){
                if(n%div == 0){
                    cnt++;
                    break;
                }
            }
            if(cnt == 0){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }


    }
}