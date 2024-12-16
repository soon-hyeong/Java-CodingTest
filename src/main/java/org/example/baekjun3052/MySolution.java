package org.example.baekjun3052;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class MySolution {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arr.add(i, scanner.nextInt());
        }

        ArrayList<Integer> n = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            n.add(i, arr.get(i) % 42);
        }

        //arrayList를 오름차순으로 정렬하고자하지만 방법을 잘 모르겄다. 메서드가 있을 것 같다.
        n.sort(Comparator.naturalOrder());

        int temp = n.get(0);
        int count = 1;
        for(int i = 1; i < 10; i++){
            if(temp != n.get(i)){
                temp = n.get(i);
                ++count;
            }
        }

        System.out.println(count);
    }
}
