package org.example.boj2577;

import java.util.Scanner;

public class MySolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        Integer mulNum = num1 * num2 * num3;
        char[] mulNumArr =  mulNum.toString().toCharArray();

        for(int i = 0; i < 10; i++){
            int count = 0;
            for(int j = 0; j < mulNumArr.length; j++){
                if(mulNumArr[j] == i + '0'){
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
}
