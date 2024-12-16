package org.example.baekjun1152;

import java.util.Scanner;

public class MySolution {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        char blank = ' ';
        String words  = scanner.nextLine();

        int count = 0;
        int i = 0;
        loop1: while (i < words.length()){
            while(words.charAt(i) == blank){
                ++i;
                if(i >= words.length())
                    break loop1;
            }
            if(words.charAt(i) != blank){
                ++count;
                while(words.charAt(i) != blank){
                    ++i;
                    if(i >= words.length())
                        break loop1;
                }
            }
        }

        System.out.println(count);
    }
}
