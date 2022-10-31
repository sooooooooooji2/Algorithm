package com.example.algorithm.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        char[] arrStr = str.nextToken().toCharArray();
        char ch = str.nextToken().charAt(0);
        int[] arrInt = new int[arrStr.length];
        int[] arrInt2 = new int[arrStr.length];
        int num = arrStr.length ;

        for(int i = 0 ; i < arrStr.length; i++) {
            if(arrStr[i] == ch) {
                //같으면
                num = 0;
            }else {
                num++;
            }
            arrInt[i] = num;
        }

        for(int i = arrStr.length - 1; i >  - 1; i--) {
            if(arrStr[i] == ch) {
                //같으면
                num = 0;
                arrInt2[i] = num;
            }else {
                num++;
                arrInt2[i] = num;
                if(arrInt2[i] > arrInt[i]) {
                    arrInt2[i] = arrInt[i];
                }
            }
        }

        for(int i : arrInt2) {
            System.out.print(i+" ");
        }
    }
}

//[문제]
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출 력하는 프로그램을 작성하세요.
//
//[입력]
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다. 문자열의 길이는 100을 넘지 않는다.
//teachermode e
//
//[출력]
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
//10121012210