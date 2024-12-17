package org.example.boj2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TeacherSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            char[] text = st.nextToken().toCharArray();
            for(int j = 0; j < text.length; j++){
                for(int k = 0; k<R; k++){
                    System.out.print(text[j]);
                }
            }
            System.out.println();
        }
    }
}
