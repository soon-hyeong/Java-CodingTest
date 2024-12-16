package org.example.baekjun3052;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TeacherSolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 10; i++){
            int temp = sc.nextInt() % 42;
            set.add(temp);
        }
        System.out.println(set.size());
    }
}
