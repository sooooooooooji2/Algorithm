package com.example.algorithm.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class Main6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        String inStr = str.nextToken();
        String result = "";

        for(int i = 0 ; i < inStr.length(); i++){
            if(inStr.indexOf(inStr.charAt(i)) == i) result += inStr.charAt(i);
        }

        System.out.println(result);
    }

}

//[문제]
//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하 세요.
//제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
//
//[입력]
//첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
//ksekkset
//
//[출력]
//첫 줄에 중복문자가 제거된 문자열을 출력합니다.
//kset

