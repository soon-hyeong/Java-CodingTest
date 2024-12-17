package org.example.boj10809;

import java.util.ArrayList;
import java.util.Scanner;

public class MySolution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        ArrayList<Integer> arr = new ArrayList<>();

        char a = 'a';
        while(a <= 'z'){
            int i;
            for(i = 0 ; i < word.length(); i++){
                if(word.charAt(i) == a){
                    arr.add(i);
                    break;
                }
            }
            if(i == word.length())
                arr.add(-1);
            ++a;
        }

        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i));
            if(i != arr.size() - 1){
                System.out.print(" ");
            }
        }
    }
}
