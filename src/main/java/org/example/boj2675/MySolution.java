package org.example.boj2675;

import java.util.ArrayList;
import java.util.Scanner;

public class MySolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nTest = sc.nextInt();
        for(int i = 0; i < nTest; i++){

            int multiple = sc.nextInt();
            String word = sc.nextLine();
            word = word.substring(1);

            for(int j = 0; j < word.length(); j++){
                for(int k = 0; k < multiple; k++){
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}