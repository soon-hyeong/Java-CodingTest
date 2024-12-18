package org.example.boj2577;

import java.util.Scanner;

public class TeacherSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A*B*C;
        char[] arr = Integer.toString(result).toCharArray();

        int[] count = new int[10];

        for(int i = 0; i < arr.length; i++){
            int temp = Integer.parseInt(String.valueOf(arr[i]));
            count[temp]++;
        }

        for(int i = 0; i < count.length; i++){
            System.out.println(count[i]);
        }
    }
}
