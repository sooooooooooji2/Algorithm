package com.example.algorithm.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        String inStr = str.nextToken().toUpperCase();
        String revStr = new StringBuffer(inStr).reverse().toString();
        if(revStr.equals(inStr)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}

//[문제]
//앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력 하는 프로그램을 작성하세요.
//단 회문을 검사할 때 대소문자를 구분하지 않습니다.
//
//[입력]
//첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
//gooG
//
//[출력]
//YES
