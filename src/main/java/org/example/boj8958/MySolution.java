package org.example.boj8958;

import java.util.Scanner;

public class MySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trial = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < trial; i++){

            char[] quiz = sc.nextLine().toCharArray();

            int totalScore = 0;
            int score = 0;
            for(int j = 0; j < quiz.length; j++){
                if(quiz[j] == 'O') {
                    ++score;
                    totalScore += score;
                }
                else
                    score = 0;
            }
            System.out.println(totalScore);
        }
    }
}
